<h2><a href="https://leetcode.com/problems/min-stack/">155. Min Stack</a></h2><h3>Medium</h3><hr><div element-id="1074"><p element-id="1073">Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.</p>

<p element-id="1072">Implement the <code element-id="1071">MinStack</code> class:</p>

<ul element-id="1070">
	<li element-id="1069"><code element-id="1068">MinStack()</code> initializes the stack object.</li>
	<li element-id="1067"><code element-id="1066">void push(int val)</code> pushes the element <code element-id="1065">val</code> onto the stack.</li>
	<li element-id="1064"><code element-id="1063">void pop()</code> removes the element on the top of the stack.</li>
	<li element-id="1062"><code element-id="1061">int top()</code> gets the top element of the stack.</li>
	<li element-id="1060"><code element-id="1059">int getMin()</code> retrieves the minimum element in the stack.</li>
</ul>

<p element-id="1058">You must implement a solution with <code element-id="1057">O(1)</code> time complexity for each function.</p>

<p element-id="1056">&nbsp;</p>
<p element-id="1055"><strong class="example" element-id="1054">Example 1:</strong></p>

<pre element-id="1053"><strong element-id="1052">Input</strong>
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

<strong element-id="1051">Output</strong>
[null,null,null,null,-3,null,0,-2]

<strong element-id="1050">Explanation</strong>
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
</pre>

<p element-id="1049">&nbsp;</p>
<p element-id="1048"><strong element-id="1047">Constraints:</strong></p>

<ul element-id="1046">
	<li element-id="1045"><code element-id="1044">-2<sup element-id="1043">31</sup> &lt;= val &lt;= 2<sup element-id="1042">31</sup> - 1</code></li>
	<li element-id="1041">Methods <code element-id="1040">pop</code>, <code element-id="1039">top</code> and <code element-id="1038">getMin</code> operations will always be called on <strong element-id="1037">non-empty</strong> stacks.</li>
	<li element-id="1036">At most <code element-id="1035">3 * 10<sup element-id="1034">4</sup></code> calls will be made to <code element-id="1033">push</code>, <code element-id="1032">pop</code>, <code element-id="1031">top</code>, and <code element-id="1030">getMin</code>.</li>
</ul>
</div>