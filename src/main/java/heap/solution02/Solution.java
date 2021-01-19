package heap.solution02;

import java.util.*;

public class Solution {

    class Job {
        int requestTime;
        int processTime;

        Job(int requestTime, int processTime) {
            this.requestTime = requestTime;
            this.processTime = processTime;
        }
    }

    public int solution(int[][] jobs) {
        int answer = 0;

        // 분석
        // 요청이 들어온 정보의 소요시간이 짧은 것부터 처리하면 평균 처리 시간이 최소가 된다.
        // job의 정보 중 첫번째 요소를 처리 후, 다음 요소 부터는 소요시간이 짧은 항목부터 처리해야 한다.
        // 요소를 처리하는 시간 내에 존재하는 요청에 대해서 처리하여야 한다.
        // SJF (Shortest Job First) 방식으로 처리한다.

        // 구현
        LinkedList<Job> jobList = new LinkedList<>(); // 요청 된 Job 을 넣을 리스트.
        PriorityQueue<Job> jobQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o.processTime)); // 작업 시간 기준으로 정렬할 우선순위 큐

        // 대기 큐에 모든 작업을 요청 시간 기준으로 정렬하여 넣는다.
        for(int[] job : jobs) {
            jobList.offer(new Job(job[0], job[1]));
        }
        // 대기 큐의 작업을 요청 시간 기준으로 정렬한다.
        Collections.sort(jobList, Comparator.comparingInt(o -> o.requestTime));

        int count = 0;
        int curTime = jobList.peek().requestTime;   // 처음 요청시간을 가져온다.
        while(count < jobs.length) {    // 요청 갯수만큼 수행한다.
            while(!jobList.isEmpty() && jobList.peek().requestTime <= curTime) { // 대기 리스트의 요청 시간이 현재 작업 시간 이내인 것 중
                jobQueue.offer(jobList.pollFirst());    // 가장 작업시간이 작은것을 순서대로 jobQueue 에 넣는다.
            }
            if(jobQueue.isEmpty()) {    // 작업 정보가 없는 경우 시간을 소요시킨다.
                curTime += 1;
                continue;
            }
            Job job = jobQueue.poll();
            curTime += job.processTime; // 작업 소요시간을 더해준다.
            answer += curTime - job.requestTime;    // 요청시간을 빼서 순수 작업 시간을 더해주어야 한다.
            count += 1; // 처리 한 갯수 카운트
        }

        answer /= count;    // 평균 시간으로 처리.

        return answer;
    }

}
