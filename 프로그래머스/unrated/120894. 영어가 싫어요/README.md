# [level unrated] 영어가 싫어요 - 120894 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120894) 

### 성능 요약

메모리: 10.4 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 12월 6일 16:7:9

### 문제 설명

<p style="user-select: auto !important;">영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 <code style="user-select: auto !important;">numbers</code>가 매개변수로 주어질 때, <code style="user-select: auto !important;">numbers</code>를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">numbers</code>는 소문자로만 구성되어 있습니다.</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">numbers</code>는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">numbers</code>의 길이 ≤ 50</li>
<li style="user-select: auto !important;">"zero"는 <code style="user-select: auto !important;">numbers</code>의 맨 앞에 올 수 없습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">numbers</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"onetwothreefourfivesixseveneightnine"</td>
<td style="user-select: auto !important;">123456789</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"onefourzerosixseven"</td>
<td style="user-select: auto !important;">14067</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"onetwothreefourfivesixseveneightnine"를 숫자로 바꾼 123456789를 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"onefourzerosixseven"를 숫자로 바꾼 14067를 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges