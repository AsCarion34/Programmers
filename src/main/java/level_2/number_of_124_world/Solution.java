package level_2.number_of_124_world;

public class Solution {
    /***
     * 3으로 나눈 나머지값으로 계산한다.
     */
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] indexArray = {"4", "1", "2"};

        while(n > 0) {
            answer.insert(0, indexArray[n % 3]);
            n = (n - 1) / 3;
        }

        return answer.toString();
    }
}
