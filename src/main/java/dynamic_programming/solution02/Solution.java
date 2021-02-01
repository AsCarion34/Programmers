package dynamic_programming.solution02;

public class Solution {
    /***
     * 분석
     * 최대 경로를 구해야 하는데.
     * 방문 할 수 있는 경로는 정해져있다. (점화식을 만들자)
     * 동적 계획법으로 처리해보자.
     *
     * @param triangle
     * @return
     */
    public int solution(int[][] triangle) {
        int answer = 0;

        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];  // 맨 처음 가중치를 넣는다.

        for(int i = 1; i < triangle.length; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0) {    // 맨 왼쪽인 경우 바로 위의 값과 더한다.
                    dp[i][j] = dp[i - 1][j] + triangle[i][j];
                } else if(i == j) { // 제일 오른쪽인 경우
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
                }
                answer = Math.max(answer, dp[i][j]);
            }
        }

        return answer;
    }
}
