package exhaustive_search.solution03;

public class Solution {
    /***
     * @분석
     * 가운데 yellow 가 들어가려면 적어도 가로/세로 3 이상이어야 함.
     * 총 격자의 갯수의 약수의 pair 를 구한다. (모든 원소가 3 이상, 가로가 세로보다 커야 함)
     *
     * @param brown
     * @param yellow
     * @return int[] : width, height
     */
    public int[] solution(int brown, int yellow) {
        int[] answer = {};

        int blocks = brown + yellow;    // 총 격자 갯수
        for(int i = 3; i <= blocks; i++) {
            // 약수 구하기
            if(blocks % i != 0) {
                continue;
            }

            int width = blocks / i;         // 가로
            int height = blocks / width;    // 세로
            int yellowWidth = width - 2;    // yellow 의 가로
            int yellowHeight = height -2;   // yellow 의 세로
            if( (yellowWidth * yellowHeight) == yellow && width >= height) {
                // yellow 의 크기가 맞고 가로가 세로 이상인 경우
                answer = new int[] {width, height};
                break;
            }
        }

        return answer;
    }
}
