package level_2.expressions_of_number;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        /* 정수론 (자연수의 연속된 자연수의 합으로 표현하는 방법의 수는, 주어진 수의 홀수 약수의 개수와 같다)
        for(int i = 1; i <= n; i += 2) {
            if(n % i == 0) {
                answer += 1;
            }
        }
        */

        // 1 부터 차례로 더하면서 값이 n 이 되는경우 체크
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            int offset = i;
            while(sum < n && offset <= n) {
                sum += offset++;
            }
            if(sum == n)
                answer += 1;
        }

        return answer;
    }
}
