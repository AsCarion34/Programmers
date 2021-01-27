package greedy.Solution06;

import java.util.Arrays;

public class Solution {
    /***
     * @분석
     * 주어진 선분의 각 시작과 끝 점의 요소들 중 최소 교집합 갯수를 구하기.
     *
     *     |--------------------------------------|
     *         |-------------|
     *       |----|
     *                          |-------------|
     * |--------a-----------------------b----------|
     * 위와 같은 경우, 주어진 routes 에서 최소 a, b 두개의 지점이 필요하다.
     *
     * @방식
     * 중첩되는 범위를 카운트 하는게 골자인데..
     * 각 요소의 in, out 이 중첩되는 만큼 나누어보자.
     *
     * @param routes
     * @return
     */
    public int solution(int[][] routes) {
        int answer = 0;

        // route[] = 0 : In, 1 : Out
        // In 기준으로 오름차순 정렬
        Arrays.sort(routes, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);   // in이 같으면 out 으로 정렬
            }
            return Integer.compare(o1[0], o2[0]);
        });

        answer = 1; // 초기 카메라 세팅.
        int outRange = routes[0][1];  // 최초 가능 범위
        for(int i = 1; i < routes.length - 1; i++) {
            // 현재 범위와 기준 범위 비교
            if(routes[i][1] < outRange) { // 현재 (route) 의 out 이 이전 (outRange) 보다 작은 경우
                outRange = routes[i][1];    // 범위를 갱신해준다.
            }

            if(routes[i+1][0] > outRange) { // 다음 진입점이 현재 범위보다 크면 카메라가 추가로 필요하다.
                answer += 1;
                outRange = routes[i+1][1];  // 다음 범위로 갱신
            }
        }

        return answer;
    }
}
