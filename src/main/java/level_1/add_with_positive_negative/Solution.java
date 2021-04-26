package level_1.add_with_positive_negative;

public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++) {
            if(!signs[i]) {
                absolutes[i] *= -1;
            }
            answer += absolutes[i];
        }

        return answer;
    }
}
