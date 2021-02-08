package level_1.sum_of_between_two_integers;

public class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        // a + (a + 1) + (a + 2) + (a + n) + b 의 공식이 되어야 한다. (a < b) 인 경우.
        // 공식 처럼 수행되기 위해 큰 수와 작은수를 구별하여야 한다.
        // a == b 인 경우 <= 에 의해 한번은 처리가 된다.
        for(long i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }

        return answer;
    }
}
