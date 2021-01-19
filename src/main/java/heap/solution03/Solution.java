package heap.solution03;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

    public int[] solution(String[] operations) {
        int[] answer = {};

        // 분석
        // operations 를 파싱하여 순서대로 데이터를 처리하여야 한다.
        // 작업 대상 정렬 된 힙 구조를 사용하여야 한다.
        // 우선순위 큐를 사용하여 데이터를 정렬하여 입력/삭제 하되, pollFirst / poolLast 처리로 최대값/최소값을 처리한다.

        // 구현
        PriorityQueue<Integer> ascQueue = new PriorityQueue<>();   // 기본적으로 오름차순이다.
        PriorityQueue<Integer> descQueue = new PriorityQueue<>(Collections.reverseOrder());    // 내림차순
        //PriorityQueue<Integer> descQueue = new PriorityQueue<>((s1, s2) -> s2 - s1);    // 내림차순

        // 입력 정보를 파싱하여 처리 한다.
        for(String oper : operations) {
            String[] tmp = oper.split("\\s");
            String cmd = tmp[0];
            int param = Integer.parseInt(tmp[1]);
            switch (cmd) {
                case "I":   // 데이터 넣는다.
                    ascQueue.offer(param);
                    descQueue.offer(param);
                    break;
                case "D":   // param 에 따라 데이터를 처리한다.
                    if(ascQueue.isEmpty() && descQueue.isEmpty()) {
                        break;  // 비어 있는 큐에 대한 처리 무시.
                    }
                    if(param == 1) {
                        ascQueue.remove(descQueue.poll());   // 최대값 삭제
                    }
                    if(param == -1) {
                        descQueue.remove(ascQueue.poll());  // 최소값 삭제
                    }
                    break;
            }
        }

        if(ascQueue.isEmpty() && descQueue.isEmpty()) {
            answer = new int[] {0, 0};
        }
        else {
            answer = new int[] {descQueue.poll(), ascQueue.poll() };
        }


        return answer;
    }
}
