package level_1.string_patterns;

public class Solution {
    public String solution(int n) {
        String answer = "";

        // 홀수이면 수, 짝수이면 박 을 붙이면 될거 같은데.
        for(int i = 1; i <= n; i++) {
            answer += (i % 2 == 1) ? "수" : "박";
        }

        return answer;
    }
}
