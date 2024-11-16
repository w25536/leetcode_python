<h2><a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">167. Two Sum II - Input Array Is Sorted</a></h2><h3>Medium</h3><hr><div element-id="921"><p element-id="920">Given a <strong element-id="919">1-indexed</strong> array of integers <code element-id="918">numbers</code> that is already <strong element-id="917"><em element-id="916">sorted in non-decreasing order</em></strong>, find two numbers such that they add up to a specific <code element-id="915">target</code> number. Let these two numbers be <code element-id="914">numbers[index<sub element-id="913">1</sub>]</code> and <code element-id="912">numbers[index<sub element-id="911">2</sub>]</code> where <code element-id="910">1 &lt;= index<sub element-id="909">1</sub> &lt; index<sub element-id="908">2</sub> &lt;= numbers.length</code>.</p>

<p element-id="907">Return<em element-id="906"> the indices of the two numbers, </em><code element-id="905">index<sub element-id="904">1</sub></code><em element-id="903"> and </em><code element-id="902">index<sub element-id="901">2</sub></code><em element-id="900">, <strong element-id="899">added by one</strong> as an integer array </em><code element-id="898">[index<sub element-id="897">1</sub>, index<sub element-id="896">2</sub>]</code><em element-id="895"> of length 2.</em></p>

<p element-id="894">The tests are generated such that there is <strong element-id="893">exactly one solution</strong>. You <strong element-id="892">may not</strong> use the same element twice.</p>

<p element-id="891">Your solution must use only constant extra space.</p>

<p element-id="890">&nbsp;</p>
<p element-id="889"><strong class="example" element-id="888">Example 1:</strong></p>

<pre element-id="887"><strong element-id="886">Input:</strong> numbers = [<u element-id="885">2</u>,<u element-id="884">7</u>,11,15], target = 9
<strong element-id="883">Output:</strong> [1,2]
<strong element-id="882">Explanation:</strong> The sum of 2 and 7 is 9. Therefore, index<sub element-id="881">1</sub> = 1, index<sub element-id="880">2</sub> = 2. We return [1, 2].
</pre>

<p element-id="879"><strong class="example" element-id="878">Example 2:</strong></p>

<pre element-id="877"><strong element-id="876">Input:</strong> numbers = [<u element-id="875">2</u>,3,<u element-id="874">4</u>], target = 6
<strong element-id="873">Output:</strong> [1,3]
<strong element-id="872">Explanation:</strong> The sum of 2 and 4 is 6. Therefore index<sub element-id="871">1</sub> = 1, index<sub element-id="870">2</sub> = 3. We return [1, 3].
</pre>

<p element-id="869"><strong class="example" element-id="868">Example 3:</strong></p>

<pre element-id="867"><strong element-id="866">Input:</strong> numbers = [<u element-id="865">-1</u>,<u element-id="864">0</u>], target = -1
<strong element-id="863">Output:</strong> [1,2]
<strong element-id="862">Explanation:</strong> The sum of -1 and 0 is -1. Therefore index<sub element-id="861">1</sub> = 1, index<sub element-id="860">2</sub> = 2. We return [1, 2].
</pre>

<p element-id="859">&nbsp;</p>
<p element-id="858"><strong element-id="857">Constraints:</strong></p>

<ul element-id="856">
	<li element-id="855"><code element-id="854">2 &lt;= numbers.length &lt;= 3 * 10<sup element-id="853">4</sup></code></li>
	<li element-id="852"><code element-id="851">-1000 &lt;= numbers[i] &lt;= 1000</code></li>
	<li element-id="850"><code element-id="849">numbers</code> is sorted in <strong element-id="848">non-decreasing order</strong>.</li>
	<li element-id="847"><code element-id="846">-1000 &lt;= target &lt;= 1000</code></li>
	<li element-id="845">The tests are generated such that there is <strong element-id="844">exactly one solution</strong>.</li>
</ul>
</div>