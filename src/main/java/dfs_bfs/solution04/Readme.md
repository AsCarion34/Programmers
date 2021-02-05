# 여행경로

<h6>문제 설명</h6>
<p>
주어진 항공권을 모두 이용하여 여행경로를 짜려고 합니다. 항상
<q>ICN</q>
공항에서 출발합니다.
</p>

<p>항공권 정보가 담긴 2차원 배열 tickets가 매개변수로 주어질 때, 방문하는 공항 경로를 배열에 담아 return 하도록 solution 함수를 작성해주세요.</p>

<h5>제한사항</h5>

<ul>
    <li>모든 공항은 알파벳 대문자 3글자로 이루어집니다.</li>
    <li>주어진 공항 수는 3개 이상 10,000개 이하입니다.</li>
    <li>tickets의 각 행 [a, b]는 a 공항에서 b 공항으로 가는 항공권이 있다는 의미입니다.</li>
    <li>주어진 항공권은 모두 사용해야 합니다.</li>
    <li>만일 가능한 경로가 2개 이상일 경우 알파벳 순서가 앞서는 경로를 return 합니다.</li>
    <li>모든 도시를 방문할 수 없는 경우는 주어지지 않습니다.</li>
</ul>

<h5>입출력 예</h5>
<table>
    <thead>
        <tr>
            <th>tickets</th>
            <th>return</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>
                [[
                <q>ICN</q>
                , 
                <q>JFK</q>
                ], [
                <q>HND</q>
                , 
                <q>IAD</q>
                ], [
                <q>JFK</q>
                , 
                <q>HND</q>
                ]]
            </td>
            <td>
                [
                <q>ICN</q>
                , 
                <q>JFK</q>
                , 
                <q>HND</q>
                , 
                <q>IAD</q>
                ]
            </td>
        </tr>
        <tr>
            <td>
                [[
                <q>ICN</q>
                , 
                <q>SFO</q>
                ], [
                <q>ICN</q>
                , 
                <q>ATL</q>
                ], [
                <q>SFO</q>
                , 
                <q>ATL</q>
                ], [
                <q>ATL</q>
                , 
                <q>ICN</q>
                ], [
                <q>ATL</q>
                ,
                <q>SFO</q>
                ]]
            </td>
            <td>
                [
                <q>ICN</q>
                , 
                <q>ATL</q>
                , 
                <q>ICN</q>
                , 
                <q>SFO</q>
                , 
                <q>ATL</q>
                , 
                <q>SFO</q>
                ]
            </td>
        </tr>
    </tbody>
</table>
<h5>입출력 예 설명</h5>

<p>예제 #1</p>

<p>
    [
    <q>ICN</q>
    , 
    <q>JFK</q>
    , 
    <q>HND</q>
    , 
    <q>IAD</q>
    ] 순으로 방문할 수 있습니다.
</p>

<p>예제 #2</p>

<p>
    [
    <q>ICN</q>
    , 
    <q>SFO</q>
    , 
    <q>ATL</q>
    , 
    <q>ICN</q>
    , 
    <q>ATL</q>
    , 
    <q>SFO</q>
    ] 순으로 방문할 수도 있지만 [
    <q>ICN</q>
    , 
    <q>ATL</q>
    , 
    <q>ICN</q>
    , 
    <q>SFO</q>
    , 
    <q>ATL</q>
    , 
    <q>SFO</q>
    ] 가 알파벳 순으로 앞섭니다.
</p>