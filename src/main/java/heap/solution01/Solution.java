package heap.solution01;

import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        // 분석
        // scoville 배열의 원소 중 K 이하인 원소를 순서대로 스코빌 공식을 이용하여 대치 : x1 + (x2 * 2)
        // 모든 원소가 K 이상이 되었을 떄의 횟수를 반환

        // 방식
        // scoville 을 정렬한다. (자료구조 이용)
        // 가장 작은 원소와 그 다음 작은 원소를 계산한다. (조건 : K 이하인 정수)
        // 계산 한 원소를 다시 넣고 반복한다.

        // 우선순위 큐를 사용해보자.
        // 낮은 숫자 순으로 우선순위가 정해진다.
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int e : scoville) {
            heap.offer(e);  // 힙에 데이터를 넣는다.
        }

        while(heap.peek() <= K) {
            if(heap.size() == 1) {
                return -1;  // 크기가 1 이므로 스코빌 지수를 K 이상으로 만들 수 없다.
            }
            // 가장 작은 수 2개를 꺼내서 계산 한 결과를 다시 넣는다.
            heap.offer(heap.poll() + (heap.poll() * 2));
            answer += 1; // 횟수를 더한다.
        }

        return answer;
    }
}
