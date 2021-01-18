<li>전화번호 목록</li>

<p>
    전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
    <br>
    전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
</p>

<ul>
    <li>구조대 : 119</li>
    <li>박준영 : 97 674 223</li>
    <li>지영석 : 11 9552 4421</li>
</ul>

<p>전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.</p>

<h5>제한 사항</h5>

<ul>
    <li>phone_book의 길이는 1 이상 1,000,000 이하입니다.</li>
    <li>각 전화번호의 길이는 1 이상 20 이하입니다.</li>
</ul>

<h5>입출력 예제</h5>
<table class="table">
    <thead>
        <tr>
            <th>phone_book</th>
            <th>return</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>
                [
                <q>119</q>
                , 
                <q>97674223</q>
                , 
                <q>1195524421</q>
                ]
            </td>
            <td>false</td>
        </tr>
        <tr>
            <td>
                [
                <q>123</q>
                ,
                <q>456</q>
                ,
                <q>789</q>
                ]
            </td>
            <td>true</td>
        </tr>
        <tr>
            <td>
                [
                <q>12</q>
                ,
                <q>123</q>
                ,
                <q>1235</q>
                ,
                <q>567</q>
                ,
                <q>88</q>
                ]
            </td>
            <td>false</td>
        </tr>
    </tbody>
</table>
<h5>입출력 예 설명</h5>

<p>
    입출력 예 #1
    <br>
    앞에서 설명한 예와 같습니다.
</p>

<p>
    입출력 예 #2
    <br>
    한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.
</p>

<p>
    입출력 예 #3
    <br>
    첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.
</p>

<hr>

<p>
    <strong>알림</strong>
</p>

<p>2019년 5월 13일, 테스트 케이스가 변경되었습니다.  이로 인해 이전에 통과하던 코드가 더 이상 통과하지 않을 수 있습니다.</p>

<p>
    <a href="https://ncpc.idi.ntnu.no/ncpc2007/ncpc2007problems.pdf" target="_blank" rel="noopener">출처</a>
</p>