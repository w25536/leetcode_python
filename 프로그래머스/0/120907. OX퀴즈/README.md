# [level 0] OX퀴즈 - 120907 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120907) 

### 성능 요약

메모리: 10.2 MB, 시간: 0.04 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 2월 2일 15:3:4

### 문제 설명

<p style="user-select: auto !important;">덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 <code style="user-select: auto !important;">quiz</code>가 매개변수로 주어집니다. 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">연산 기호와 숫자 사이는 항상 하나의 공백이 존재합니다. 단 음수를 표시하는 마이너스 기호와 숫자 사이에는 공백이 존재하지 않습니다.</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">quiz</code>의 길이 ≤ 10</li>
<li style="user-select: auto !important;">X, Y, Z는 각각 0부터 9까지 숫자로 이루어진 정수를 의미하며, 각 숫자의 맨 앞에 마이너스 기호가 하나 있을 수 있고 이는 음수를 의미합니다.</li>
<li style="user-select: auto !important;">X, Y, Z는 0을 제외하고는 0으로 시작하지 않습니다.</li>
<li style="user-select: auto !important;">-10,000 ≤ X, Y ≤ 10,000</li>
<li style="user-select: auto !important;">-20,000 ≤ Z ≤ 20,000</li>
<li style="user-select: auto !important;">[연산자]는 + 와 - 중 하나입니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">quiz</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">["3 - 4 = -3", "5 + 6 = 11"]</td>
<td style="user-select: auto !important;">["X", "O"]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">["19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"]</td>
<td style="user-select: auto !important;">["O", "O", "X", "O"]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">3 - 4 = -3 은 틀린 수식이므로 "X", 5 + 6 = 11 은 옳은 수식이므로 "O" 입니다. 따라서 ["X", "O"]를 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">19 - 6 = 13 은 옳은 수식이므로 "O", 5 + 66 = 71 은 옳은 수식이므로 "O", 5 - 15 = 63 은 틀린 수식이므로 "X", 3 - 1 = 2는 옳은 수식이므로 "O" 따라서 ["O", "O", "X", "O"]를 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges