# [level 0] 잘라서 배열로 저장하기 - 120913 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120913) 

### 성능 요약

메모리: 10.2 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 2월 4일 14:29:9

### 문제 설명

<p style="user-select: auto !important;">문자열 <code style="user-select: auto !important;">my_str</code>과 <code style="user-select: auto !important;">n</code>이 매개변수로 주어질 때, <code style="user-select: auto !important;">my_str</code>을 길이 <code style="user-select: auto !important;">n</code>씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">my_str</code>의 길이 ≤ 100</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">n</code> ≤ <code style="user-select: auto !important;">my_str</code>의 길이</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">my_str</code>은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">my_str</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"abc1Addfggg4556b"</td>
<td style="user-select: auto !important;">6</td>
<td style="user-select: auto !important;">["abc1Ad", "dfggg4", "556b"]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"abcdef123"</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">["abc", "def", "123"]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"abc1Addfggg4556b" 를 길이 6씩 잘라 배열에 저장한 ["abc1Ad", "dfggg4", "556b"]를 return해야 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"abcdef123" 를 길이 3씩 잘라 배열에 저장한 ["abc", "def", "123"]를 return해야 합니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">유의사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">입출력 예 #1의 경우 "abc1Addfggg4556b"를 길이 6씩 자르면 "abc1Ad", "dfggg4" 두개와 마지막 "556b"가 남습니다. 이런 경우 남은 문자열을 그대로 배열에 저장합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges