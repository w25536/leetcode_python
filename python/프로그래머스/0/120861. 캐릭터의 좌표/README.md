# [level 0] 캐릭터의 좌표 - 120861 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120861) 

### 성능 요약

메모리: 10.2 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 2월 4일 17:12:19

### 문제 설명

<p style="user-select: auto !important;">머쓱이는 RPG게임을 하고 있습니다. 게임에는 <code style="user-select: auto !important;">up</code>, <code style="user-select: auto !important;">down</code>, <code style="user-select: auto !important;">left</code>, <code style="user-select: auto !important;">right</code> 방향키가 있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다. 예를 들어 [0,0]에서 <code style="user-select: auto !important;">up</code>을 누른다면 캐릭터의 좌표는 [0, 1], <code style="user-select: auto !important;">down</code>을 누른다면 [0, -1], <code style="user-select: auto !important;">left</code>를 누른다면 [-1, 0], <code style="user-select: auto !important;">right</code>를 누른다면 [1, 0]입니다. 머쓱이가 입력한 방향키의 배열 <code style="user-select: auto !important;">keyinput</code>와 맵의 크기 <code style="user-select: auto !important;">board</code>이 매개변수로 주어집니다. 캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해주세요.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">[0, 0]은 <code style="user-select: auto !important;">board</code>의 정 중앙에 위치합니다. 예를 들어 <code style="user-select: auto !important;">board</code>의 가로 크기가 9라면 캐릭터는 왼쪽으로 최대 [-4, 0]까지 오른쪽으로 최대 [4, 0]까지 이동할 수 있습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">board</code>은 [가로 크기, 세로 크기] 형태로 주어집니다.</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">board</code>의 가로 크기와 세로 크기는 홀수입니다.</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">board</code>의 크기를 벗어난 방향키 입력은 무시합니다.</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">keyinput</code>의 길이 ≤ 50</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">board</code>[0]&nbsp;≤ 99</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">board</code>[1] ≤ 99</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">keyinput</code>은 항상 <code style="user-select: auto !important;">up</code>, <code style="user-select: auto !important;">down</code>, <code style="user-select: auto !important;">left</code>, <code style="user-select: auto !important;">right</code>만 주어집니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">keyinput</th>
<th style="user-select: auto !important;">board</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">["left", "right", "up", "right", "right"]</td>
<td style="user-select: auto !important;">[11, 11]</td>
<td style="user-select: auto !important;">[2, 1]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">["down", "down", "down", "down", "down"]</td>
<td style="user-select: auto !important;">[7, 9]</td>
<td style="user-select: auto !important;">[0, -4]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 설명 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">[0, 0]에서 왼쪽으로 한 칸 오른쪽으로 한 칸 위로 한 칸 오른쪽으로 두 칸 이동한 좌표는 [2, 1]입니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 설명 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">[0, 0]에서 아래로 다섯 칸 이동한 좌표는 [0, -5]이지만 맵의 세로 크기가 9이므로 아래로는 네 칸을 넘어서 이동할 수 없습니다. 따라서 [0, -4]를 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges