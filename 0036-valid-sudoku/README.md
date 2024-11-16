<h2><a href="https://leetcode.com/problems/valid-sudoku/">36. Valid Sudoku</a></h2><h3>Medium</h3><hr><div element-id="688"><p element-id="687">Determine if a&nbsp;<code element-id="686">9 x 9</code> Sudoku board&nbsp;is valid.&nbsp;Only the filled cells need to be validated&nbsp;<strong element-id="685">according to the following rules</strong>:</p>

<ol element-id="684">
	<li element-id="683">Each row&nbsp;must contain the&nbsp;digits&nbsp;<code element-id="682">1-9</code> without repetition.</li>
	<li element-id="681">Each column must contain the digits&nbsp;<code element-id="680">1-9</code>&nbsp;without repetition.</li>
	<li element-id="679">Each of the nine&nbsp;<code element-id="678">3 x 3</code> sub-boxes of the grid must contain the digits&nbsp;<code element-id="677">1-9</code>&nbsp;without repetition.</li>
</ol>

<p element-id="676"><strong element-id="675">Note:</strong></p>

<ul element-id="674">
	<li element-id="673">A Sudoku board (partially filled) could be valid but is not necessarily solvable.</li>
	<li element-id="672">Only the filled cells need to be validated according to the mentioned&nbsp;rules.</li>
</ul>

<p element-id="671">&nbsp;</p>
<p element-id="670"><strong class="example" element-id="669">Example 1:</strong></p>
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png" style="height:250px; width:250px" element-id="668">
<pre element-id="667"><strong element-id="666">Input:</strong> board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
<strong element-id="665">Output:</strong> true
</pre>

<p element-id="664"><strong class="example" element-id="663">Example 2:</strong></p>

<pre element-id="662"><strong element-id="661">Input:</strong> board = 
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
<strong element-id="660">Output:</strong> false
<strong element-id="659">Explanation:</strong> Same as Example 1, except with the <strong element-id="658">5</strong> in the top left corner being modified to <strong element-id="657">8</strong>. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
</pre>

<p element-id="656">&nbsp;</p>
<p element-id="655"><strong element-id="654">Constraints:</strong></p>

<ul element-id="653">
	<li element-id="652"><code element-id="651">board.length == 9</code></li>
	<li element-id="650"><code element-id="649">board[i].length == 9</code></li>
	<li element-id="648"><code element-id="647">board[i][j]</code> is a digit <code element-id="646">1-9</code> or <code element-id="645">'.'</code>.</li>
</ul>
</div>