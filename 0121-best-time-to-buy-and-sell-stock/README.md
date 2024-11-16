<h2><a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">121. Best Time to Buy and Sell Stock</a></h2><h3>Easy</h3><hr><div element-id="1154"><p element-id="1153">You are given an array <code element-id="1152">prices</code> where <code element-id="1151">prices[i]</code> is the price of a given stock on the <code element-id="1150">i<sup element-id="1149">th</sup></code> day.</p>

<p element-id="1148">You want to maximize your profit by choosing a <strong element-id="1147">single day</strong> to buy one stock and choosing a <strong element-id="1146">different day in the future</strong> to sell that stock.</p>

<p element-id="1145">Return <em element-id="1144">the maximum profit you can achieve from this transaction</em>. If you cannot achieve any profit, return <code element-id="1143">0</code>.</p>

<p element-id="1142">&nbsp;</p>
<p element-id="1141"><strong class="example" element-id="1140">Example 1:</strong></p>

<pre element-id="1139"><strong element-id="1138">Input:</strong> prices = [7,1,5,3,6,4]
<strong element-id="1137">Output:</strong> 5
<strong element-id="1136">Explanation:</strong> Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
</pre>

<p element-id="1135"><strong class="example" element-id="1134">Example 2:</strong></p>

<pre element-id="1133"><strong element-id="1132">Input:</strong> prices = [7,6,4,3,1]
<strong element-id="1131">Output:</strong> 0
<strong element-id="1130">Explanation:</strong> In this case, no transactions are done and the max profit = 0.
</pre>

<p element-id="1129">&nbsp;</p>
<p element-id="1128"><strong element-id="1127">Constraints:</strong></p>

<ul element-id="1126">
	<li element-id="1125"><code element-id="1124">1 &lt;= prices.length &lt;= 10<sup element-id="1123">5</sup></code></li>
	<li element-id="1122"><code element-id="1121">0 &lt;= prices[i] &lt;= 10<sup element-id="1120">4</sup></code></li>
</ul>
</div>