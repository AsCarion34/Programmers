package level_1.sum_of_factors;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        // 자신의 수 부터 나눈 나머지가 없는 값을 모두 더한다.
        for(int i = n; i >= 1; i--) {
            if(n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
