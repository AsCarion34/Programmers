package level_2.more_spicy;

import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num : scoville) {
            heap.offer(num);
        }

        while(heap.peek() <= K) {
            if(heap.size() == 1) {
                return -1;
            }
            heap.offer(heap.poll() + (heap.poll() * 2));
            answer += 1;
        }

        return answer;
    }
}
