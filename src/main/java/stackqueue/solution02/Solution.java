package stackqueue.solution02;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution {

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        // 문제 해석.
        // 1. 주어진 배열이 100 이 될때 까지 걸리는 시간을 구한다. (올림 처리)
        // 2. 배열의 다음 원소가 선두 원소 보다 작으면 선두 원소가 배포 시 함께 배포된다. (갯수)
        // 3. 다음 원소가 선두 원보보다 크면 선두 원소로 지정 후 2. 를 반복한다.

        // 7, 3, 9
        // 5, 10, 1, 1, 20, 1

        // 시간 배열을 구한다.
        Queue<Integer> remainQueue = new ConcurrentLinkedQueue<>();
        for(int i = 0; i < progresses.length; i++) {
            /*
            int remains = (100 - progresses[i]) / speeds[i];
            int quot = (100 - progresses[i]) % speeds[i];
            if(quot > 0) {
                remains += 1;
            }
            days.add(remains);
            */
            remainQueue.add((int)Math.ceil((100 - (double)progresses[i]) / (double)speeds[i]));
        }

        // 7, 3, 9
        // 5, 10, 1, 1, 20, 1
        // 배열의 다음 원소를 순회하면서 자신보다 오래 걸리는 놈을 만날떄까지 순회한다.
        List<Integer> deployCountList = new ArrayList<>();
        int prevProgress = remainQueue.poll();
        int count = 1;
        while(!remainQueue.isEmpty()) {
            int currentProgress = remainQueue.poll();
            if(prevProgress >= currentProgress) {
                count += 1;
            } else {
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
