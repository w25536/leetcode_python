# [level unrated] 한 번만 등장한 문자 - 120896 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120896) 

### 성능 요약

메모리: 10.3 MB, 시간: 0.01 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 12월 6일 16:14:46

### 문제 설명

<p style="user-select: auto !important;">문자열 <code style="user-select: auto !important;">s</code>가 매개변수로 주어집니다. <code style="user-select: auto !important;">s</code>에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">0 &lt; <code style="user-select: auto !important;">s</code>의 길이 &lt; 1,000</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">s</code>는 소문자로만 이루어져 있습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">s</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"abcabcadc"</td>
<td style="user-select: auto !important;">"d"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"abdc"</td>
<td style="user-select: auto !important;">"abcd"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"hello"</td>
<td style="user-select: auto !important;">"eho"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"abcabcadc"에서 하나만 등장하는 문자는 "d"입니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"abdc"에서 모든 문자가 한 번씩 등장하므로 사전 순으로 정렬한 "abcd"를 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #3</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"hello"에서 한 번씩 등장한 문자는 "heo"이고 이를 사전 순으로 정렬한 "eho"를 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges