<h2><a href="https://leetcode.com/problems/container-with-most-water/">11. Container With Most Water</a></h2><h3>Medium</h3><hr><div element-id="843"><p element-id="842">You are given an integer array <code element-id="841">height</code> of length <code element-id="840">n</code>. There are <code element-id="839">n</code> vertical lines drawn such that the two endpoints of the <code element-id="838">i<sup element-id="837">th</sup></code> line are <code element-id="836">(i, 0)</code> and <code element-id="835">(i, height[i])</code>.</p>

<p element-id="834">Find two lines that together with the x-axis form a container, such that the container contains the most water.</p>

<p element-id="833">Return <em element-id="832">the maximum amount of water a container can store</em>.</p>

<p element-id="831"><strong element-id="830">Notice</strong> that you may not slant the container.</p>

<p element-id="829">&nbsp;</p>
<p element-id="828"><strong class="example" element-id="827">Example 1:</strong></p>
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg" style="width: 600px; height: 287px;" element-id="826">
<pre element-id="825"><strong element-id="824">Input:</strong> height = [1,8,6,2,5,4,8,3,7]
<strong element-id="823">Output:</strong> 49
<strong element-id="822">Explanation:</strong> The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
</pre>

<p element-id="821"><strong class="example" element-id="820">Example 2:</strong></p>

<pre element-id="819"><strong element-id="818">Input:</strong> height = [1,1]
<strong element-id="817">Output:</strong> 1
</pre>

<p element-id="816">&nbsp;</p>
<p element-id="815"><strong element-id="814">Constraints:</strong></p>

<ul element-id="813">
	<li element-id="812"><code element-id="811">n == height.length</code></li>
	<li element-id="810"><code element-id="809">2 &lt;= n &lt;= 10<sup element-id="808">5</sup></code></li>
	<li element-id="807"><code element-id="806">0 &lt;= height[i] &lt;= 10<sup element-id="805">4</sup></code></li>
</ul>
</div>