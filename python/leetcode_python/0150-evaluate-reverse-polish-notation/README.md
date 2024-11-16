<h2><a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">150. Evaluate Reverse Polish Notation</a></h2><h3>Medium</h3><hr><div element-id="1735"><p element-id="1734">You are given an array of strings <code element-id="1733">tokens</code> that represents an arithmetic expression in a <a href="http://en.wikipedia.org/wiki/Reverse_Polish_notation" target="_blank" element-id="1732">Reverse Polish Notation</a>.</p>

<p element-id="1731">Evaluate the expression. Return <em element-id="1730">an integer that represents the value of the expression</em>.</p>

<p element-id="1729"><strong element-id="1728">Note</strong> that:</p>

<ul element-id="1727">
	<li element-id="1726">The valid operators are <code element-id="1725">'+'</code>, <code element-id="1724">'-'</code>, <code element-id="1723">'*'</code>, and <code element-id="1722">'/'</code>.</li>
	<li element-id="1721">Each operand may be an integer or another expression.</li>
	<li element-id="1720">The division between two integers always <strong element-id="1719">truncates toward zero</strong>.</li>
	<li element-id="1718">There will not be any division by zero.</li>
	<li element-id="1717">The input represents a valid arithmetic expression in a reverse polish notation.</li>
	<li element-id="1716">The answer and all the intermediate calculations can be represented in a <strong element-id="1715">32-bit</strong> integer.</li>
</ul>

<p element-id="1714">&nbsp;</p>
<p element-id="1713"><strong class="example" element-id="1712">Example 1:</strong></p>

<pre element-id="1711"><strong element-id="1710">Input:</strong> tokens = ["2","1","+","3","*"]
<strong element-id="1709">Output:</strong> 9
<strong element-id="1708">Explanation:</strong> ((2 + 1) * 3) = 9
</pre>

<p element-id="1707"><strong class="example" element-id="1706">Example 2:</strong></p>

<pre element-id="1705"><strong element-id="1704">Input:</strong> tokens = ["4","13","5","/","+"]
<strong element-id="1703">Output:</strong> 6
<strong element-id="1702">Explanation:</strong> (4 + (13 / 5)) = 6
</pre>

<p element-id="1701"><strong class="example" element-id="1700">Example 3:</strong></p>

<pre element-id="1699"><strong element-id="1698">Input:</strong> tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
<strong element-id="1697">Output:</strong> 22
<strong element-id="1696">Explanation:</strong> ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
</pre>

<p element-id="1695">&nbsp;</p>
<p element-id="1694"><strong element-id="1693">Constraints:</strong></p>

<ul element-id="1692">
	<li element-id="1691"><code element-id="1690">1 &lt;= tokens.length &lt;= 10<sup element-id="1689">4</sup></code></li>
	<li element-id="1688"><code element-id="1687">tokens[i]</code> is either an operator: <code element-id="1686">"+"</code>, <code element-id="1685">"-"</code>, <code element-id="1684">"*"</code>, or <code element-id="1683">"/"</code>, or an integer in the range <code element-id="1682">[-200, 200]</code>.</li>
</ul>
</div>