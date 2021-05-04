package level_1.add_digits;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // 숫자를 % 로 나눈 나머지로 각각 더한다.
        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
