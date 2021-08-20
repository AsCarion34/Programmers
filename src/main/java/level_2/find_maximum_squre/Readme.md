# 가장 큰 정사각형 찾기

### 문제설명

1와 0로 채워진 표(board)가 있습니다.  
표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다.  
표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 solution 함수를 완성해 주세요.  
(단, 정사각형이란 축에 평행한 정사각형을 말합니다.)

예를 들어
<table>
    <thead>
        <tr>
            <th style="text-align: center">1</th>
            <th style="text-align: center">2</th>
            <th style="text-align: center">3</th>
            <th style="text-align: center">4</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td style="text-align: center">0</td>
            <td style="text-align: center">1</td>
            <td style="text-align: center">1</td>
            <td style="text-align: center">1</td>
        </tr>
        <tr>
            <td style="text-align: center">1</td>
            <td style="text-align: center">1</td>
            <td style="text-align: center">1</td>
            <td style="text-align: center">1</td>
        </tr>
        <tr>
            <td style="text-align: center">1</td>
            <td style="text-align: center">1</td>
            <td style="text-align: center">1</td>
            <td style="text-align: center">1</td>
        </tr>
        <tr>
            <td style="text-align: center">0</td>
            <td style="text-align: center">0</td>
            <td style="text-align: center">1</td>
            <td style="text-align: center">0</td>
        </tr>
    </tbody>
</table>

가 있다면 가장 큰 정사각형은
<table>
    <thead>
        <tr>
            <th style="text-align: center">1</th>
            <th style="text-align: center">2</th>
            <th style="text-align: center">3</th>
            <th style="text-align: center">4</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td style="text-align: center">0</td>
            <td style="text-align: center"><code>1</code></td>
            <td style="text-align: center"><code>1</code></td>
            <td style="text-align: center"><code>1</code></td>
        </tr>
        <tr>
            <td style="text-align: center">1</td>
            <td style="text-align: center"><code>1</code></td>
            <td style="text-align: center"><code>1</code></td>
            <td style="text-align: center"><code>1</code></td>
        </tr>
        <tr>
            <td style="text-align: center">1</td>
            <td style="text-align: center"><code>1</code></td>
            <td style="text-align: center"><code>1</code></td>
            <td style="text-align: center"><code>1</code></td>
        </tr>
        <tr>
            <td style="text-align: center">0</td>
            <td style="text-align: center">0</td>
            <td style="text-align: center">1</td>
            <td style="text-align: center">0</td>
        </tr>
    </tbody>
</table>

가 되며 넓이는 9가 되므로 9를 반환해 주면 됩니다.

###제한사항

- 표(board)는 2차원 배열로 주어집니다.
- 표(board)의 행(row)의 크기 : 1,000 이하의 자연수
- 표(board)의 열(column)의 크기 : 1,000 이하의 자연수
- 표(board)의 값은 1또는 0으로만 이루어져 있습니다.

<hr>

###입출력 예
<table>
    <thead>
        <tr>
            <th>board</th>
            <th>answer</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>[[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]</td>
            <td>9</td>
        </tr>
        <tr>
            <td>[[0,0,1,1],[1,1,1,1]]</td>
            <td>4</td>
        </tr>
    </tbody>
</table>

###입출력 예 설명

입출력 예 #1  
위의 예시와 같습니다.

입출력 예 #2  
| 0 | 0 | <code>1</code> | <code>1</code> |  
| 1 | 1 | <code>1</code> | <code>1</code> |  

로 가장 큰 정사각형의 넓이는 4가 되므로 4를 return 합니다.

