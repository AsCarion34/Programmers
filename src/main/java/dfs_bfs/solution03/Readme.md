# 단어 변환

<h6>문제 설명</h6>
<p>두 개의 단어 begin, target과 단어의 집합 words가 있습니다. 아래와 같은 규칙을 이용하여 begin에서 target으로 변환하는 가장 짧은 변환 과정을 찾으려고 합니다.</p>
<pre>
<code>1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
2. words에 있는 단어로만 변환할 수 있습니다.</code>
</pre>
<p>
예를 들어 begin이
<q>hit</q>
, target가
<q>cog</q>
, words가 [
<q>hot</q>
,
<q>dot</q>
,
<q>dog</q>
,
<q>lot</q>
,
<q>log</q>
,
<q>cog</q>
]라면
<q>hit</q>
-&gt;
<q>hot</q>
-&gt;
<q>dot</q>
-&gt;
<q>dog</q>
-&gt;
<q>cog</q>
와 같이 4단계를 거쳐 변환할 수 있습니다.
</p>

<p>두 개의 단어 begin, target과 단어의 집합 words가 매개변수로 주어질 때, 최소 몇 단계의 과정을 거쳐 begin을 target으로 변환할 수 있는지 return 하도록 solution 함수를 작성해주세요.</p>

<h5>제한사항</h5>

<ul>
    <li>각 단어는 알파벳 소문자로만 이루어져 있습니다.</li>
    <li>각 단어의 길이는 3 이상 10 이하이며 모든 단어의 길이는 같습니다.</li>
    <li>words에는 3개 이상 50개 이하의 단어가 있으며 중복되는 단어는 없습니다.</li>
    <li>begin과 target은 같지 않습니다.</li>
    <li>변환할 수 없는 경우에는 0를 return 합니다.</li>
</ul>

<h5>입출력 예</h5>
<table>
    <thead>
        <tr>
            <th>begin</th>
            <th>target</th>
            <th>words</th>
            <th>return</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>
                <q>hit</q>
            </td>
            <td>
                <q>cog</q>
            </td>
            <td>
                [
                <q>hot</q>
                , 
                <q>dot</q>
                , 
                <q>dog</q>
                , 
                <q>lot</q>
                , 
                <q>log</q>
                , 
                <q>cog</q>
                ]
            </td>
            <td>4</td>
        </tr>
        <tr>
            <td>
                <q>hit</q>
            </td>
            <td>
                <q>cog</q>
            </td>
            <td>
                [
                <q>hot</q>
                , 
                <q>dot</q>
                , 
                <q>dog</q>
                , 
                <q>lot</q>
                , 
                <q>log</q>
                ]
            </td>
            <td>0</td>
        </tr>
    </tbody>
</table>
<h5>입출력 예 설명</h5>

<p>
    예제 #1
    <br>
    문제에 나온 예와 같습니다.
</p>

<p>
    예제 #2
    <br>
    target인 
    <q>cog</q>
    는 words 안에 없기 때문에 변환할 수 없습니다.
</p>