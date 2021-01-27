package greedy.solution05;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    /***
     * @분석
     * from - cost - dest 의 관계로 자료구조를 만들면서 from 부터 오름차순 정렬
     * 0 - n 까지 최소 경로를 확인하며 계산한다.
     *
     * @param n
     * @param costs
     * @return
     */
    public int solution(int n, int[][] costs) {
        int answer = 0;

        int[] parentIndex = new int[n]; // [노드번호] = 부모노드번호
        for(int i = 0; i < n; i++) {
            parentIndex[i] = i;
        }

        // 가중치를 기준으로 오름차순 정렬한다.
        Arrays.sort(costs, Comparator.comparingInt(o -> o[2]));

        for(int[] cost : costs) {
            int fromIsland = getParent(parentIndex, cost[0]);
            int toIsland = getParent(parentIndex, cost[1]);
            if(fromIsland != toIsland) {    // 각각의 부모가 같지 않으면 연결되지 않은 최소값이다.
                parentIndex[toIsland] = fromIsland; // 연결한다.
                answer += cost[2];  //  가중치를 더해준다.
            }
        }

        return answer;
    }

    public int getParent(int[] parentIndex, int node) {
        return parentIndex[node] == node ? node : getParent(parentIndex, parentIndex[node]);
    }
}
