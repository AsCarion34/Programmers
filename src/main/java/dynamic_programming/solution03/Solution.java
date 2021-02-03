package dynamic_programming.solution03;

public class Solution {
    /***
     * 분석
     * 각 위치를 표시하는 배열을 만들고, 방문횟수를 더한다.
     * 웅덩이 좌표인 경우, 0 을 더해준다.
     *
     * @param m
     * @param n
     * @param puddles
     * @return
     */
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] paths = new int[n + 1][m + 1];
        paths[1][1] = 1;    // 시작위치 1로 초기화

        // 각 웅덩이 값을 -1로 초기화
        for(int[] puddle : puddles) {
            paths[puddle[1]][puddle[0]] = -1;
        }

        for(int i = 1; i < paths.length; i++) {
            for(int j = 1; j < paths[i].length; j++) {
                if(paths[i][j] == -1) {
                    paths[i][j] = 0;    // 웅덩이인 경우 0으로 처리
                } else {
                    if(i == 1) {
                        paths[i][j] += paths[i][j - 1];
                    } else {
                        paths[i][j] = (paths[i - 1][j] + paths[i][j - 1]) % 1000000007;
                    }
                }

                if(j == paths[i].length - 1) {
                    answer = paths[i][j];
                }
            }
        }

        return answer;
    }
}
