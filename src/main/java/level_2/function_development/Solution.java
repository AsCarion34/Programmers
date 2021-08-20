package level_2.function_development;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        // find Time Array
        Queue<Integer> remainQueue = new ConcurrentLinkedQueue<>();
        for(int i = 0; i < progresses.length; i++) {
            remainQueue.add((int)Math.ceil((100 - (double)progresses[i]) / (double)speeds[i]));
        }

        List<Integer> deployCountList = new ArrayList<>();
        int prevProgress = remainQueue.poll();
        int count = 1;
        while(!remainQueue.isEmpty()) {
            int currentProgress = remainQueue.poll();
            if(prevProgress >= currentProgress) {
                count += 1;
            }
            else {
                deployCountList.add(count);
                count = 1;
                prevProgress = currentProgress;
            }
        }
        deployCountList.add(count);

        answer = new int[deployCountList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = deployCountList.get(i);
        }

        return answer;
    }
}
