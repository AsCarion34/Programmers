# N 개의 최소공배수

### 문제 설명

두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.  
예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.  
n개의 숫자를 담은 배열 arr 이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution 을 완성해 주세요.

### 제한 사항

- arr 은 길이 1 이상, 15 이하인 배열입니다.
- arr 의 원소는 100 이하인 자연수입니다.

### 입출력 예
<table>
    <thead>
        <tr>
            <th>arr</th>
            <th>result</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>[2,6,8,14]</td>
            <td>168</td>
        </tr>
        <tr>
            <td>[1,2,3]</td>
            <td>6</td>
        </tr>
    </tbody>
</table>