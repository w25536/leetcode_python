import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
//IdeaVim is set up
//Text Style Multiple Selections: Alt + Shift + Mouse Click
//Array to string :Arrays.toString();
//Direct Internet Search : Shift + Command + l

    public static <T> void print(T type) {

        if (type instanceof ArrayList) {
            System.out.println(Arrays.asList(type));
        } else if (type instanceof int[]) {
            System.out.println(Arrays.toString((int[]) type));
        } else if (type instanceof char[]) {
            System.out.println(Arrays.toString((char[]) type));
        } else if (type instanceof int[][]) {
            System.out.println(Arrays.deepToString((int[][]) type));
        } else {
            System.out.println(type);
        }
    }

    public boolean isPalindrome(String s) {//125

        // Remove all non-alphanumeric characters and convert to lowercase
        String stripped = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        // Check if the stripped string is a palindrome
        for(int i=0, j=stripped.length()-1; i<j ; i++, j--){
            if(stripped.charAt(i) != stripped.charAt(j)){
                return false;
            }
        }

        return true;
    }

    public List<List<Integer>> generate(int numRows) { //118.

        //1. Initialize List<List<Integer>> type triangle.
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>()); //First row Initializes with ArrayList<>()
        triangle.get(0).add(1); //2. For the first triangle add 1.

        for(int r=1; r<numRows; r++){ //3. Handles rest of numbers from 1
            List<Integer> currRow = new ArrayList<>(); //Create new ArrayList<>();
            List<Integer> prevRow = triangle.get(r-1); //prevRow gets previous row in column
            currRow.add(1); // [1,] add first value in the front
            for(int c=1 ; c<prevRow.size(); c++){
                currRow.add(prevRow.get(c-1) + prevRow.get(c));
                // In the currRow add the values of prevRow.get(c-1) + prevRow.get(c) as it loop continues
            }
            currRow.add(1);//[1,1] add end value at the end of the for loop
            triangle.add(currRow); //Finally, added to triangle
        }

/*
      int[] arr = {1,3,3,1};

      for(int i=1; i<arr.length ; i++){
        System.out.println(arr[i] + arr[i-1]);
        //arr[1] : 3 + arr[0] : 1 = 4
        //arr[2] : 3 + arr[1] : 3 = 6
        //arr[3] : 1 + arr[2] : 3 = 4
      }
 */

        //System.out.println(Arrays.asList(triangle)); How to view all the elements in triangle.

        return triangle;
    }


    private int getNum(int r, int c){

        if(r == 0 || c == 0 || r == c){
            return 1;
        }

        // rowIndex At 0 : (0,0)
        // rowIndex At 1 : (1,0) (1,1)
        // rowIndex At 2 : (2,0) (2,1) (2,2)
        // rowIndex At 3 : (3,0) (3,1) (3,2) (3,3)
        // rowIndex At 4 : (4,0) (4,1) (4,2) (4,3) (4,4)
        // example getNum(rowIndex, c) : (4,2) will call (3,1), (3,2) and addtion of this is equal to 6

        return getNum(r - 1, c - 1) + getNum(r -1 , c);

    }


    public List<Integer> getRow(int rowIndex) {

        List<Integer> getRow = new ArrayList<>();


        for (int c = 0; c <= rowIndex; c++) {
            getRow.add(getNum(rowIndex, c));
        }


        System.out.println(Arrays.asList(getRow));


        return getRow;


    }

        /*final static int[] seq(int n, int m) {
        int[] a = new int[m + 1];

        int eq = 0;

        if (n < m) {
            eq = m - n + 1;
        } else {
            eq = n - m + 1;
        }

        int[] b = new int[eq];

        int idx = 0;

        if (n < m) {
            for (int i = n; i <= m; i++) {
                a[i] = i;
                if (a[i] != 0) {
                    idx = i;
                    break;
                }
            }

            for (int i = 0; i < b.length; i++) {
                b[i] = idx++;

            }
        } else if (n > m) {

            for (int i = 0; i < b.length; i++) {
                b[i] = n--;
            }

        }

        return b;


    }*/


    public int[] intersection(int[] nums1, int[] nums2) { //349

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int a : nums1){set1.add(a);}
        for(int b : nums2){set2.add(b);}

        System.out.println(set1.size());

        for(Integer n : set1){
            if(set2.contains(n)){
                list.add(n);
            }
        }

        int[] ans = list.stream().mapToInt(i -> i).toArray();

        return ans;
    }

    public static int romanToInt(String s) { //13

        int answer = 0;

        char[] a = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] b = {1, 5, 10, 50, 100, 500, 1000};

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int N = 7;

        for (int i = 0; i < N; i++) {
            map.put(a[i], b[i]);
        }

        int i = 0;
        int j = 0;

        char[] c = s.toCharArray();


        while (i < c.length) {

            if (c[i] == 'I') {
                j++;
                if (c[i] == 'I' && j == c.length) {
                    answer += map.get('I');
                    break;
                } else if (c[i] == 'I' && c[j] == 'V') {
                    answer = answer + (map.get('V') - map.get('I'));
                    i = j;
                    j--;
                } else if (c[i] == 'I' && c[j] == 'X') {
                    answer = answer + (map.get('X') - map.get('I'));
                    i = j;
                    j--;
                } else {
                    answer += map.get('I');
                }
            } else if (c[i] == 'V') {
                answer += map.get('V');
            } else if (c[i] == 'X') {
                j++;
                if (c[i] == 'X' && j == c.length) {
                    answer += map.get('X');
                    break;
                } else if (c[i] == 'X' && c[j] == 'L') {
                    answer = answer + (map.get('L') - map.get('X'));
                    i = j;
                    j--;
                } else if (c[i] == 'X' && c[j] == 'C') {
                    answer = answer + (map.get('C') - map.get('X'));
                    i = j;
                    j--;
                } else {
                    answer += map.get('X');
                }
            } else if (c[i] == 'L') {
                answer += map.get('L');
            } else if (c[i] == 'C') {
                j++;
                if (c[i] == 'C' && j == c.length) {
                    answer += map.get('C');
                    break;
                } else if (c[i] == 'C' && c[j] == 'D') {
                    answer = answer + (map.get('D') - map.get('C'));
                    i = j;
                    j--;
                } else if (c[i] == 'C' && c[j] == 'M') {
                    answer = answer + (map.get('M') - map.get('C'));
                    i = j;
                    j--;
                } else {
                    answer += map.get('C');
                }
            } else if (c[i] == 'D') {
                answer += map.get('D');
            } else if (c[i] == 'M') {
                answer += map.get('M');
            }
            i++;
            j = i;

        }
        return answer;
    }


    public static int[] twoSum(int[] nums, int target) { //1

        int[] answer = new int[2];

        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        m.put(i, j);
                        if (m.size() == 1) {
                            answer[0] = i;
                            answer[1] = j;
                        } else {
                            break;
                        }
                    }
                }
            }

        }
        return answer;
    }

    public static int[] runningSum(int[] nums) { //1480

        int N = nums.length;

        int[] answer = new int[N];

        int n = 0;

        for (int i = 0; i < nums.length; i++) {
            n += nums[i];
            answer[i] = n;

        }

        return answer;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) { //1431

        List<Boolean> answer = new LinkedList<>();

        int m = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > m) {
                m = candies[i];
            }
        }

        for (int c : candies) {
            c += extraCandies;
            if (c >= m) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }


        return answer;

    }


    public static int[] shuffle(int[] nums, int n) {

        int[] a = new int[n];
        int[] b = new int[n];

        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (i < n) {
                a[i] = nums[i];
            } else {
                b[i - n] = nums[i];
            }
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < answer.length) {
            if (i % 2 == 0) {
                answer[i] = a[j++];
            } else {
                answer[i] = b[k++];

            }
            i++;
        }

        return answer;
    }

    public static int numIdenticalPairs(int[] nums) {

        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (i != j) {
                    if (nums[i] == nums[j]) {
                        answer++;
                    }
                }
            }

        }

        return answer / 2;
    }

    public static int numberOfSteps(int num) {

        int answer = 0;

        while (num > 0) {

            if (num % 2 != 0) {
                num = num - 1;
            } else {
                num = num / 2;
            }
            answer++;
        }
        return answer;
    }

    public static String restoreString(String s, int[] indices) {//1528

        StringBuilder answer = new StringBuilder();

        char[] a = s.toCharArray();

        HashMap<Integer, Character> m = new HashMap<>();

        for (int i = 0; i < indices.length; i++) {
            m.put(indices[i], a[i]);
        }

        Object[] o = m.keySet().toArray();
        Arrays.sort(o);

        for (char c : m.values()) {
            answer.append(c);
        }

        return answer.toString();
    }


    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] answer = new int[nums.length];

        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] > nums[j]) {
                        answer[i]++;
                    }
                }

            }
        }

        return answer;
    }

    public int subtractProductAndSum(int n) { //1281

        int a = 0;
        int b = 0;


        char[] nums = Integer.toString(n).toCharArray();

        for (char c : nums) {
            a += Character.getNumericValue(c);
            b = b * Character.getNumericValue(c);
        }
        int answer = b - a;

        return answer;

    }

    public static int[] decompressRLElist(int[] nums) { //1313

        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i += 2) {

            while (nums[i] != 0) {

                l.add(nums[i + 1]);

                nums[i]--;
            }

        }
        int N = l.size();
        int[] answer = new int[N];
        int i = 0;

        for (int n : l) {
            answer[i++] = n;
        }

        return answer;

    }

    public static int xorOperation(int n, int start) { //1486

        int answer = 0;
        int[] a = new int[n];
        int i = 0;

        while (i < n) {
            a[i++] = start++;
            start++;
        }

        for (int d : a) {
            answer ^= d;
        }

        return answer;

    }

    public int mostWordsFound(String[] sentences) { //2114

        int countWhitespace = 0;
        int ret = -1;

        for(int i =0; i<sentences.length; i++){
            for(int j=0; j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    countWhitespace++; //sentence[0] = "alice and bob love leetcode"
                    //countWhitespace : 4
                    //sentence[1] = "i think so too"
                    //countWhitespace : 3
                    //sentence[3] = "this is great thanks very much"
                    //countWhitespace : 5
                }
            }
            ret = Math.max(countWhitespace, ret); //sentence[0] countWhitespace : 4  ret : 4
            //sentence[1] 4 > 3 - > false ret : 4
            //sentence[2] countWhitespace : 5  ret :5
            countWhitespace = 0; // back to 0 for countWhitespace and increase i
        }

        return ret+1;

    }

    public static int[] createTargetArray(int[] nums, int[] index) { //1389

        int[] answer = new int[index.length];


        ArrayList<Integer> l = new ArrayList<>();


        for (int i = 0; i < index.length; i++) {
            l.add(nums[i], index[i]);
        }

        int j = 0;
        for (int n : l) {
            answer[j++] = n;
        }

        return answer;

    }


    public static int balancedStringSplit(String s) { //1221

        int answer = 0;
        char[] cs = s.toCharArray();
        int a = 0;
        int b = 0;
        int d = 0;

        for (char c : cs) {

            if (c == 'R') {
                a++;
            }
            if (c == 'L') {
                b++;
            }

            if (a == b) {
                d++;
            }

        }
        answer = d;

        return answer;
    }


    public int findNumbers(int[] nums) { //760

        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (Integer.toString(nums[i]).length() % 2 == 0) {
                answer++;
            }

        }

        return answer;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public int getDecimalValue(ListNode head) {

        int answer = 0;
        ArrayList<Integer> l = new ArrayList<>();

        while (head != null) { //ListNode looping
            l.add(head.val);
            head = head.next;
        }

        for (int i = l.size() - 1; i >= 0; i--) {
            if (l.get(i) == 1) {
                answer += Math.pow(2, i);
            } else {
                continue;
            }
        }

        return answer;

    }


    public static int countGoodTriplets(int[] arr, int a, int b, int c) { //1534
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    if (i != j && j != k) {
                        if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            answer++;
                        }

                    }

                }
            }
        }

        return answer;
    }


    public static int minTimeToVisitAllPoints(int[][] points) {

        int answer = 0;
        for (int i = 0; i < points.length - 1; i++) {
            answer += Math.max(Math.abs(points[i + 1][0] - points[i][0]), Math.abs(points[i + 1][1] - points[i][1]));
        }
        return answer;
    }


    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }


    public static String removeOuterParentheses(String S) { //1021
        StringBuilder sb = new StringBuilder();

        int len = S.length();
        int c = 0;

        for (int i = 0; i < len; i++) {

            if (S.charAt(i) == '(') {

                if (c != 0) {
                    sb.append('(');
                }
                c++;
            } else {

                c--;
                if (c != 0) {

                    sb.append(')');
                }

            }

        }

        String answer = sb.toString();

        return answer;
    }


    public static int diagonalSum(int[][] mat) { //1572

        int answer = 0;

        int pd = 0;
        int sd = 0;

        int size = mat.length;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) {
                    pd += mat[i][j];
                    sd += mat[i][size - 1 - j];

                }
            }
        }

        if (size % 2 == 1) { //odd
            answer = pd + sd - mat[mat.length / 2][mat.length / 2];
        } else {
            answer = pd + sd;
        }


        return answer;
    }


    public static int maxProduct(int[] nums) {//1464

        //Arrays.sort(nums); Using without arrays

        int m = 0;
        int n = 0;

        //Time complexity : O(N)

        for (int i = 0; i < nums.length; i++) {
            if (m < nums[i]) {
                m = nums[i];
                int temp = nums[0];
                nums[0] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if (n < nums[i]) {
                n = nums[i];
                int temp = nums[1];
                nums[1] = nums[i];
                nums[i] = temp;
            }
        }

        return (nums[0] - 1) * (nums[1] - 1);
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) { //1450

        int answer = 0;

        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                answer++;
            }

        }

        return answer;
    }

    public static void toUpperCase() {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine(); //reads space
        System.out.printf(in.toUpperCase());

    }

    public static int maximum69Number(int num) {//1323

        char[] c = String.valueOf(num).toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '6') {
                c[i] = '9';
                break;
            }
        }

        int answer = Integer.parseInt(String.valueOf(c));

        return answer;
    }

    public static String destCity(List<List<String>> paths) {//1436

        String answer = "";

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < paths.size(); i++) {
            set.add(paths.get(i).get(0));
        }

        for (int i = 0; i < paths.size(); i++) {
            if (!set.contains(paths.get(i).get(1))) {
                answer = paths.get(i).get(1);
            }
        }

        return answer;
    }

    public static String freqAlphabets(String s) {//1309

        String[] atoi = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};

        String[] jtoz = {"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};


        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < atoi.length; i++) {
            map.put(Integer.toString(i + 1), atoi[i]);
        }
        int len = atoi.length + jtoz.length;

        for (int i = atoi.length; i < len; i++) {
            map.put(Integer.toString(i + 1).concat("#"), jtoz[i - atoi.length]);
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();


        for (int i = 1; i <= s.length(); i++) {
            print(map.containsKey((String.valueOf(s.charAt(i - 1)))));
        }

        for (int i = 1; i <= s.length(); i++) {
            if (map.containsKey(String.valueOf(s.charAt(i - 1)))) {
                sb.append(map.get(String.valueOf(i)));
            }
            int counter = 0;
            if (String.valueOf(s.charAt(i)) == "#") {
                counter = i;
                counter -= 2;
                sb2.append(counter++);

            }


        }

        print(sb);


        return null;
    }

//    static class MyHashSet<E> extends AbstractSet <E> implements Set<E>{ Hashset using HashMap
//
//        private transient HashMap<E,Object> map;
//        private static final Object PRESENT = new Object();
//
//
//        *//** Initialize your data structure here. *//*
//        public MyHashSet() { map = new HashMap<>();}
//
//        @Override
//        public Iterator<E> iterator() {
//            return map.keySet().iterator();
//        }
//
//        @Override
//        public int size() {
//            return map.size();
//        }
//
//        public boolean add(E e) {
//            return map.put(e, PRESENT) == null;
//
//        }
//
//        public boolean remove(Object o) {
//            return map.remove(o) == PRESENT;
//        }
//
//        *//** Returns true if this set contains the specified element *//*
//        public boolean contains(Object o) {
//
//            return map.containsKey(o);
//        }
//    }
//
//    static class MyHashSet{
//
//        HashMap<Integer, Object> map;
//        private static final Object PRESENT = new Object();
//
//
//
//        /** Initialize your data structure here. */
//        public MyHashSet() {
//            map = new HashMap<>();
//
//        }
//
//        public void add(int key) {
//            System.out.println(map.put(key,PRESENT) == null);
//
//        }
//
//        public void remove(int key) {
//            System.out.println(map.remove(key) == PRESENT);
//        }
//
//        /** Returns true if this set contains the specified element */
//        public boolean contains(int key) {
//           return map.containsKey(key);
//        }
//
//    }


    static class MyHashSet{ //HashSet using ArrayList

        ArrayList<Integer> l;

        /** Initialize your data structure here. */
        public MyHashSet() {
            l = new ArrayList<>();
        }


        public void add(int key){
            l.add(key);
        }

        public void remove(int key) {
            l.remove(new Integer(key));
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            for (int i = 0; i < l.size() ; i++) {
                if(l.get(i) == key){
                    return true;
                }
            }
            return false;
        }


    }

    public static int sumOddLengthSubarrays(int[] arr) { //1588

        /**ArrayList.stream().mapToInt(Integer::intValue).sum() returns sum of arrays */

        int ans = 0;
        int sum = 0;

        int n = arr.length;
        int[] p = new int[n+1];

        for (int i = 0; i < arr.length; i++) {
            p[i+1] = p[i] + arr[i];
        }


        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j <= n; j += 2) {

                ans += p[j] - p[i];
            }
        }


       /*
        PrefixSum Example
        0 1 2 3 4 5 = 15
        [1] = [0] + [1]; 1 = 1;
        [2] = [1] + [2]; 1 + 2 =3;
        [3] = [2] + [3]; 3 + 3 = 6;
        [4] = [3] + [4]; 6 + 4 = 10;
        [5] = [4] + [5]; 10 + 5 = 15;
       */

        return ans;

    }



    public static int[][] flipAndInvertImage(int[][] A) { //832
        /**https://stackoverflow.com/questions/5134555/how-to-convert-a-1d-array-to-2d-array*/

        int len = A.length;

        int[] arr = new int[len * len];


        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = A.length-1; j >=  0; j--) {
                arr[count++] =(A[i][j] ==0) ? 1 :0;

                print(arr);
            }
        }

        int[][] answer = new int[len][len];
        for (int i = 0; i < len; i++) {
            System.arraycopy(arr, (i*len), answer[i], 0, len);

        }


        return answer;

    }


    public static int countNegatives(int[][] grid) { //1351
        int count = 0;

        for (int i = 0; i < grid.length; i++) { //brute force
            for (int j = 0; j < grid[0].length; j++) {

                if(grid[i][j] < 0){
                    count++;
                }
            }
        }

        int answer = count;

        return answer;

    }

    static class ParkingSystem {//1603

        int big;
        int medium;
        int small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;

        }

        public boolean addCar(int carType) {


            switch (carType) {
                case 1:
                    if (this.big > 0) {
                        this.big--;
                        return true;
                    } else {
                        return false;
                    }
                case 2:
                    if (this.medium > 0) {
                        this.medium--;
                        return true;
                    } else {
                        return false;
                    }
                case 3:
                    if (this.small > 0) {
                        this.small--;
                        return true;
                    } else {
                        return false;
                    }

            }

            return false;
        }

    }




    public static List<Integer> selfDividingNumbers(int left, int right) {//728

        List<Integer> answer = new LinkedList<>();

        for (int i = left; i <= right ; i++) {

            if(selfDividing(i)){
                answer.add(i);
            }
        }

        return answer;
    }
    public static boolean selfDividing(int n){ //728

        int x = n ;

        //1,2,3,4,5,6,7,8,9,10
        /*

        while(1 > 0){
           int d = 1 % 10; update to 1
           x = 1 / 10; update to 0
           if(d == 0 || (1%1) > 0)
        }
        Hence, true

        while(2 > 0){
           int d = 2 % 10; update to 2
           x = k / 10; update to 0
           if(d == 0 || (2%2) > 0)
        }
        Hence, true

        .
        .
        .

         while(10 > 0){
           int d = 10 % 10; update to 0
           x = 10 / 10; update to 1
           if(d == 0 || (10%0) > 0)
        }
        Hence, false

         */


        while (x > 0){
            int d = x % 10;
            x = x /10;
            if(d == 0 || (n%d) >0 ) return false;
        }


        return true;
    }




    public static int[] finalPrices(int[] prices) { //1475

        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {

                if(j > i && prices[j] <= prices [i]) {
                    answer[i] = prices[i] - prices[j];
                    break;
                }else{
                    answer[i] = prices[i];
                }
            }
        }
        answer[prices.length-1] = prices[prices.length-1];

        return answer;
    }


    public static int[] sortArrayByParity(int[] A) { //905

        int[] answer = new int[A.length];



        return answer;

    }





    public static int repeatedNTimes(int[] A) { //961

        Map<Integer, Integer> count = new HashMap();

        for (int x: A) {
            count.put(x, count.getOrDefault(x, 0) + 1);
            /** 찾는 키가 존재 한다면 찾는 키의 값을 반환 하고 없다면 기본 값을 반환 한다. */

        }

        for (int k: count.keySet()) {
            if(count.get(k) > 1){
                return k;
            }
        }

        throw null;

    }
    public int[] sortedSquares(int[] A) {//977

        int[] answer = new int[A.length];

        for(int i =0 ; i < A.length; i++){
            answer[i] = A[i]* A[i];
        }

        Arrays.sort(answer);

        return answer;
    }




    public static boolean judgeCircle(String moves) { //657

        char[] cs = moves.toCharArray();
        int v = 0;
        int h = 0;

        for (char c: cs) {
            if(c == 'U'){
                h++;
            }else if(c == 'D'){
                h--;
            }else if(c == 'R'){
                v++;
            }else if(c == 'L'){
                v--;
            }
        }

        if(h != 0 || v != 0){
            return false;
        }

        return true;
    }

    public static int[] replaceElements(int[] arr) {//1299

        int m = 0;
        int n = arr.length-1;

        //List<Integer> l = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int[] answer = new int[arr.length];

        for (int i = n; i > 0; i--) {

            if(m < arr[i]){
                m = arr[i];
            }
            arr[i] = m;
        }

        for (int i = 1; i < arr.length; i++) {
            answer[i-1] = arr[i];
        }

        answer[n] = -1;

        return answer;

    }

    public static int[] diStringMatch(String S) {//942

        int x = 0;
        int y = S.length();
        int[] answer = new int[y+1];

        char[] ca = S.toCharArray();

        for (int i = 0; i < ca.length; i++) {
            if (ca[i] == 'I') {
                answer[i] = x;
                x++;
            } else if (ca[i] == 'D') {
                answer[i] = y;
                y--;
            }
        }

        answer[answer.length-1]= x;

        return answer;
    }



    public int heightChecker(int[] heights) {//1051

        int counter = 0;

        int[] n = new int[heights.length];

        for(int i=0; i<n.length;i++){
            n[i] = heights[i];
        }

        Arrays.sort(n);


        for(int i=0; i<heights.length;i++){
            if(heights[i] != n[i]){
                counter++;
            }
        }

        return counter;
    }


    public static int peakIndexInMountainArray(int[] arr) {//852

        int counter = 0;

        //arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1]


        for(int i=0;i<arr.length-1;i++){
            if(arr[i] <arr[i+1]){
                counter++;
            }

        }
        return counter;

    }


    public static boolean uniqueOccurrences(int[] arr) {//1207
        Map<Integer, Integer> m = new HashMap(); //key, value <- value here used as frequency



        for(int n : arr){
            m.put(n, m.getOrDefault(n, 0) + 1); // m puts the repetitive values from array
        }

        Map<Integer, Integer> k  = new HashMap();

        for(int x : m.values()){
            k.put(x, k.getOrDefault(x, 0)+1); // k puts the repetitive values from the values in return of m repetitive values
        }


        for(int y : k.keySet() ){
            if(k.get(y) > 1){ // if values have repeated then it returns false
                return false;
            }
        }

        return true;
    }


    public static List<String> subdomainVisits(String[] cpdomains) {//


        String[] cpinfo = new String[cpdomains.length];
        String[] frags = new String[cpdomains.length];
        for(String domain:cpdomains){
            cpinfo = domain.split("\\s+");
            frags = cpinfo[1].split("\\.");

        }

        System.out.println(Arrays.toString(cpinfo));
        System.out.println(Arrays.toString(frags));

        return null;

    }


    public int maximumWealth(int[][] accounts) {//1672

        int ans = 0;
        for(int i =0; i < accounts.length; i++){
            int wealth = 0;
            // 루푸 안쪽 wealth 값을 초기화 시켜 주어야 한다.
            for(int j=0; j <accounts[i].length;j++){
                wealth  +=  accounts[i][j];
                if( wealth > ans){
                    ans = wealth;
                }
            }
        }
        return ans;
    }

    public static void reverseString(char[] s) {//344

        /*ArrayList<Character> l = new ArrayList<>();

        for(int i=s.length-1; i>= 0;i--){
            l.add(s[i]);
        }

        for(int i=0; i<l.size();i++){
            s[i] = l.get(i);
        }
        ^^^^ Very slow solution ^^^^  */



    }


    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) { //1773

        int ans = 0;

        int idx = 0;
        if(ruleKey.equals("type")){
            idx = 0;
        }else if(ruleKey.equals("color")){
            idx = 1;
        }else{
            idx = 2;
        }

        for(List item : items){
            if(item.get(idx).equals(ruleValue)){
                ans++;
            }
        }

        return ans;


    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) { //1662

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i=0;i<word1.length;i++){
            sb1.append(word1[i]);
        }

        for(int i=0; i<word2.length;i++){
            sb2.append(word2[i]);
        }


        /*if(String.valueOf(sb1).equals(String.valueOf(sb2))){ // StringBuilder일 경우 .toString()으로 String type 으로 바꿔 줘야한다.
            return true;
        }else{
            return false;
        }*/

        return sb1.toString().equals( sb2.toString() );

    }

    public static int sumOddLengthSubarrays2(int[] arr) { //1588


        /*
        If (n-i)(i+1)/2 is Even; then Total number of Odd subarray :
        (n-i)(i+1)/2

        If (n-i)(i+1)/2 is Odd; then Total number of Odd subarray :
        (n-i)(i+1)/2+1
        */

        int n  = arr.length;
        int ans = 0;

        for(int i=0; i< n; i++){
            int val = (n-i) * (i+1);
            if(val % 2 == 0){
                ans += arr[i] * val/2;
            }else{
                ans += arr[i] * (val/2+1);
            }
        }

        return ans;
    }

    public static int maxDepth(String s) { //1614

        char[] c = s.toCharArray();

        Stack<Character> st = new Stack<>();

        int ans = 0;

        for(int i=0; i < c.length; i++){
            if(c[i] == '('){
                st.push('(');
            }else if(c[i] == ')' && st.peek() =='(' ){
                int cur =  st.size();
                st.pop();
                if(cur > ans){
                    ans = cur;
                }
            }

        }

        return ans;
    }

    public boolean isValid(String s){ //20

        Stack<Character> st = new Stack<>();
        char[] stoc = s.toCharArray(); //1. Converts String to Character array

        for(int i=0 ; i<stoc.length; i++){
            if(stoc[i] == '(' || stoc[i] == '{' || stoc[i] =='['){ // 2. Stores the char elements starting (,{,[ on to the Stack.
                st.push(stoc[i]);
            }else if(stoc[i] ==')'&& st.peek() == '('){ // 3. if the elements of the index of i found to be ),},]
                //then checks the peek of the Stack that matches with (,{,[ pops the elements.
                st.pop();
            }else if(stoc[i] =='}'&& st.peek() == '{'){
                st.pop();
            }else if(stoc[i] ==']'&& st.peek() == '['){
                st.pop();
            }

        }
        return st.isEmpty();
    }

    public int finalValueAfterOperations(String[] operations) {
        int ret = 0;

        for(int i=0; i<operations.length; i++){ //String must use .equals() operation rather than == in logic
            if(operations[i].charAt(0) == ('-') || operations[i].charAt(1) == ('-')){
                ret--;
            }else{
                ret++;
            }
        }
        return ret;
    }

    public String interpret(String command) { //1678

        StringBuilder sb = new StringBuilder();

        char[] c = command.toCharArray();

        for(int i=0;i<c.length;i++){
            if(c[i] == 'G'){
                sb.append("G");
            }else if(c[i] == '(' && c[i+1] == ')'){
                sb.append("o");
                i++;
            }else{
                sb.append("al");
                i+=3;
            }

        }

        return sb.toString();
    }

    public static int countGoodRectangles(int[][] rectangles) {

        int[] a = new int[rectangles.length];

        for(int i=0;i<rectangles.length;i++){
            a[i] =  Math.min(rectangles[i][0], rectangles[i][1]);
        }
        Arrays.sort(a);
        int ans = 0;
        int count = 1;

        for(int i=0;i<a.length;i++){
            if(a[i] == a[rectangles.length-1])
                ans = count++;
        }

        return ans;
    }

    public static double average(int[] salary) {

        Arrays.sort(salary);
        int n = 0;
        int m = 0;
        for(int i=0; i<salary.length;i++){
            m = salary[0]+salary[salary.length-1];
            n += salary[i];
        }

        return (double) (n - m) / (salary.length-2);
    }

    public static boolean threeConsecutiveOdds(int[] arr) {//1550

        boolean[] a = new boolean[arr.length];

        int count = 0;

        for(int i=0; i<a.length;i++){
            if(arr[i]%2!=0){
                count++;
                if(count >= 3){
                    return true;
                }
            }else{
                count = 0;

            }
        }

        return false;

    }


    public static int singleNumber(int[] nums) {//136

        HashMap<Integer, Integer> has_table = new HashMap<>();

        for(int i : nums){
            has_table.put(i, has_table.getOrDefault(i, 0) + 1);

        }

        for(int i : nums){
            if(has_table.get(i) ==1){
                return i;
            }
        }

        return 0;
    }

    public boolean divisorGame(int N) {//1025

        return N % 2 == 0;

    }

    public int isPrefixOfWord(String sentence, String searchWord) { //1455

        String[] words = sentence.split(" ");

        for(int i=0; i<words.length;i++){
            for(int j=0; j<words[i].length();j++)
                if(words[i].charAt(j) == searchWord.charAt(j)){
                    return i;
                }
        }




        return -1;
    }

    public int search(int[] nums, int target) { //704
        int first = 0;
        int last = nums.length -1;
        int mid = (first + last)/2;

        while(first <= last){
            if(nums[mid] < target){
                first = mid + 1;
            }else if(nums[mid] == target){
                return mid;
            }else{
                last = mid -1;
            }
            mid = (first + last)/2;
        }

        return -1;
    }

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while(left < right){
            int mid = left +(right - left) / 2;
            //if(isBadVersion(mid)){
            right = mid;
            //}else{
            left = mid +1;
            //}

        }

        return left;

    }


    public int[] runningSum2(int[] nums) { //5004
        for(int i=0 ; i<nums.length-1;i++){
            nums[i+1] = nums[i] +nums[i+1];
        }
        return nums;

    }

    public void rotate(int[] nums, int k) { //medium 189

        int[] a = new int[nums.length];

        for(int i=0 ; i<nums.length; i++){
            //Starts filling up from 3,4,5,6 then leftover 0,1,2 Testcase : [1,2,3,4,5,6,7]
            a[(i+k) % nums.length] = nums[i];
        }

        for(int i=0; i<nums.length; i++){
            //Copy all the arrays to initial nums array
            nums[i] = a[i];
        }

    }


    public String reverseWords(String s) { //557 two pointers
        int spaceFound = -1;
        char[] chArray = s.toCharArray();
        int len = s.length();

        for(int strIndex=0; strIndex<=len; strIndex++){ //27
            if(strIndex == len || chArray[strIndex] == ' '){//5, 10, 19, 27
                int start = spaceFound+1;
                int end = strIndex-1;
                reverse(start, end, chArray);
                spaceFound = strIndex; //stores space character : 5, 10, 19, 27
            }

        }
        return new String(chArray); // char array to String array
    }

    public char[] reverse(int s, int e, char[] chArray) {
        while (s < e) {
            char temp = chArray[s];
            chArray[s] = chArray[e];
            chArray[e] = temp;
            s++;
            e--;
        }
        return chArray;
    }


    public static ListNode middleNode(ListNode head) {
        ListNode[] ln = new ListNode[100]; // ListNode array
        int t = 0;
        while (head != null) { //ListNode looping method
            ln[t++] = head;
            head = head.next;
        }

        return ln[t / 2];
    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode currentNode = head;
        int length=0;
        while(currentNode != null){ //finds the length
            currentNode = currentNode.next;
            length++;
        }

        int kthNodefromTheBeginningIndex = k-1; //finds the beginning node index to swap with
        int kthNodefromTheEndIndex = length-k; // finds the end node index to swap with


        ListNode frontNode = head;
        ListNode endNode = head;


        for(int i=0 ; i< kthNodefromTheBeginningIndex; i++){
            frontNode = frontNode.next; // loops through to the element of node index in the beginning
        }

        for(int i=0 ; i<kthNodefromTheEndIndex; i++){
            endNode = endNode.next; // created another end node to loop through to the element of node index in the end
        }

        int temp = frontNode.val; // simply swaps their nodes of front node and end note values
        frontNode.val = endNode.val;
        endNode.val = temp;


        return head;
    }



    /*   public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }


        public ListNode removeNthFromEnd(ListNode head, int n) {

            int length = 0;
            ListNode currentNode = head;
            while(currentNode != null){ //finds the length of ListNode
                currentNode = currentNode.next;
                length++; //5
            }


            //1-2-3-4-5
            int nodeBeforeToRemoveIndex = length - n - 1; //2
            //length of list node - target nth node will return the end of the list node to remove


            if(length == n){
                //case 2 has same length and nth node to remove, which causes the null pointer exception
                return head.next;
            }


            currentNode = head;
            System.out.println(currentNode.val);

            for(int i=0 ; i < nodeBeforeToRemoveIndex; i++){
                //currentNode goes to the nodeBeforeToRemove Index
                currentNode = currentNode.next;
            }

            currentNode.next = currentNode.next.next;
            //ListNode 4 will replace to ListNode 5

            System.out.print(head);
            return head;
        }*/

    public boolean containsDuplicate(int[] nums) { //217
        Set<Integer> set = new HashSet<>(nums.length); //if testcase is 1,2,3,4
        for(int x : nums){
            if(set.contains(x)) return true; // check hashset whether it has 1 ofc no so return false
            set.add(x); // 1 will be stored to hashset and with the same method it goes on...
        }

        return false;
    }

    public boolean checkInclusion(String s1, String s2) { //567 medium


        //1. checks if the length s1 is bigger than s2 return false.
        if(s1.length()  > s2.length()){
            return false;
        }

        //2. <Character, Integer>
        //K : stores the chracters in s1
        //V : occurences of the s1 characters
        HashMap<Character, Integer> s1map = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i), 0)+1);
        }


        //3. <Character, Integer>
        // Loops through s2.length() - s2.length()
        //K : stores the characters in s2
        //0 1 2 3 4 5 6 7 -> legnth() == 8
        //e i d b o a o o
        //e i             -> s2map = [e=1, i=1];
        //  i d ... goes on till 6 so total 7 times
        //V : getOrDefault(s2.charAt(i+j),0)+1
        for(int i=0;i<=s2.length() - s1.length();i++){
            HashMap<Character, Integer> s2map = new HashMap<>();
            for(int j=0;j<s1.length();j++){
                s2map.put(s2.charAt(i+j), s2map.getOrDefault(s2.charAt(i+j), 0)+1);
            }

            //4. checks for the matches in character maps -> s1map and s2map
            if(mathches(s1map, s2map)){
                return true;
            }
        }
        return false;
    }

    public boolean mathches(HashMap<Character, Integer> s1map, HashMap<Character, Integer> s2map){

        //4.
        //s1map.get(key : a b ) returns the occurence values of them


        for(char key: s1map.keySet()){ // returns the key of the characters from s1map
            if(s1map.get(key) - s2map.getOrDefault(key, -1) != 0 ){
                //a b
                //System.out.println(s1map.get(key) - s2map.getOrDefault(key, -1));
                // if key is s1map.get(key)  s2map.getOrDefault
                // return false if is not 0 -> default value -1 will returned
                // Therefore, 1 - (-1) = 2
                //System.out.println(Arrays.asList(s1map));
                //System.out.println(Arrays.asList(s2map));

                return false;
            }
        }

        return true;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }


            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            current.next = new ListNode(sum % 10);
            carry = sum / 10;
            current = current.next;

        }

        return dummy.next;
    }


    public static void main(String[] args) throws NullPointerException {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        long startTime = System.nanoTime();
        ListNode sum = addTwoNumbers(l1, l2);
        long endTime = System.nanoTime();

        //long duration = (endTime - startTime);  // in nanoseconds
        //System.out.println("Duration: " + duration + " ns");

        double durationSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Duration: " + durationSeconds + " s");

        ListNode current = sum;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }





  /*
        MyHashSet hashSet = new MyHashSet();

        print(hashSet.contains(0));
        print(hashSet.contains(1));    // returns true
        print(hashSet.contains(3));    // returns false (not found)

        hashSet.add(2);

        print(hashSet.contains(2));    // returns true
        hashSet.remove(2);
        print(hashSet.toString());

        print(hashSet.contains(2));    // returns false (already removed)

        Iterator value  = hashSet.iterator();
        ArrayList<Object> l = new ArrayList<>();

        while (value.hasNext()){
            l.add(value.next());
        }

        print(l);
  */



    }
}



