package level_2.hopscotch;

import java.util.Arrays;

public class Solution {
    /***
     * 문제 분석
     * Row 별로 가장 큰수를 구한다.
     * 다음 Row 에서는 이전 Row 와 같은 Column 을 제외한 가장 큰 수를 구해야 한다.
     *
     * Dynamic 프로그래밍 방식으로 처리해야 할 것 같다.
     * n 의 행에 n - 1 의 최대값을 찾아서 더한 값을 넣는 작업을 반복한다.
     * 이후 마지막 행에서 가장 큰 값을 확인한다.
     */
    int solution(int[][] land) {
        for(int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
            land[i][1] += Math.max(Math.max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
            land[i][2] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][3]);
            land[i][3] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][2]);
        }

        return Arrays.stream(land[land.length - 1]).max().orElse(0);
    }
}
