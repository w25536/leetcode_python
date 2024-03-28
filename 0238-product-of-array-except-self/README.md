<h2><a href="https://leetcode.com/problems/product-of-array-except-self/">238. Product of Array Except Self</a></h2><h3>Medium</h3><hr><div element-id="1030"><p element-id="1029">Given an integer array <code element-id="1028">nums</code>, return <em element-id="1027">an array</em> <code element-id="1026">answer</code> <em element-id="1025">such that</em> <code element-id="1024">answer[i]</code> <em element-id="1023">is equal to the product of all the elements of</em> <code element-id="1022">nums</code> <em element-id="1021">except</em> <code element-id="1020">nums[i]</code>.</p>

<p element-id="1019">The product of any prefix or suffix of <code element-id="1018">nums</code> is <strong element-id="1017">guaranteed</strong> to fit in a <strong element-id="1016">32-bit</strong> integer.</p>

<p element-id="1015">You must write an algorithm that runs in&nbsp;<code element-id="1014">O(n)</code>&nbsp;time and without using the division operation.</p>

<p element-id="1013">&nbsp;</p>
<p element-id="1012"><strong class="example" element-id="1011">Example 1:</strong></p>
<pre element-id="1010"><strong element-id="1009">Input:</strong> nums = [1,2,3,4]
<strong element-id="1008">Output:</strong> [24,12,8,6]
</pre><p element-id="1007"><strong class="example" element-id="1006">Example 2:</strong></p>
<pre element-id="1005"><strong element-id="1004">Input:</strong> nums = [-1,1,0,-3,3]
<strong element-id="1003">Output:</strong> [0,0,9,0,0]
</pre>
<p element-id="1002">&nbsp;</p>
<p element-id="1001"><strong element-id="1000">Constraints:</strong></p>

<ul element-id="999">
	<li element-id="998"><code element-id="997">2 &lt;= nums.length &lt;= 10<sup element-id="996">5</sup></code></li>
	<li element-id="995"><code element-id="994">-30 &lt;= nums[i] &lt;= 30</code></li>
	<li element-id="993">The product of any prefix or suffix of <code element-id="992">nums</code> is <strong element-id="991">guaranteed</strong> to fit in a <strong element-id="990">32-bit</strong> integer.</li>
</ul>

<p element-id="989">&nbsp;</p>
<p element-id="988"><strong element-id="987">Follow up:</strong>&nbsp;Can you solve the problem in <code element-id="986">O(1)</code>&nbsp;extra&nbsp;space complexity? (The output array <strong element-id="985">does not</strong> count as extra space for space complexity analysis.)</p>
</div>