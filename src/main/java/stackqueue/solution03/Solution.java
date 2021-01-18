package stackqueue.solution03;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        // 분석
        // FIFO(Queue) 를 bridge_length 만큼의 사이즈로 만든다.
        // truck 을 하나씩 bridge queue 에 enqueue 하되, bridge 의 무게 보다 많은 truck 이 enqueue 되지 않도록 해야 한다.
        // 현재 bridge queue 에 올라간 truck 의 총 무게를 알아야 한다.
        // 초 체크는? -> bridge queue 를 dequeue 한 시간.

        // 구현
        int passedTruck = 0;                            // 지나간 Truck 갯수.
        Queue<Integer> truck = new LinkedList<>();      // truck 큐.
        Queue<Integer> bridge = new LinkedList<>();     // bridge_length 의 사이즈 만큼의 큐 생성

        // truck queue 생성
        for (int truck_weight : truck_weights) {
            truck.offer(truck_weight);
        }

        // bridge queue 생성
        for(int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        int curWeight = 0;
        while(passedTruck != truck_weights.length) {    // passedTruck 이 truck_weights 와 같으면 모두 지나간 것이다.
            // 이 안에서는 1초당 동작 해야 할 일들이다.

            // 나갈 놈을 하나 빼고, curWeight 에서 뺴줘야겠지.
            if(bridge.size() >= bridge_length - 1) { // 뒤에서 하나 들어오니 여기서 미리 나간다.
                // 나올 녀석이 트럭이면 (0이 아니면) 카운트 올려주자.
                if(bridge.peek() != 0) {
                    passedTruck += 1;
                }
                curWeight -= bridge.poll();
            }

            // 넣는다.
            if(!truck.isEmpty()) {
                if( weight >= (curWeight + truck.peek()) ) {      // 들어올 트럭을 올렸을떄의 무게
                    // 무게가 남으므로 올리자.
                    curWeight += truck.peek();    // truck 의 무게를 더해주고,
                    bridge.offer(truck.poll());     // truck 을 다리로 올린다.
                } else {
                    // 무게 때문에 트럭을 다리에 올리지 못했으므로 1초 밀자.
                    bridge.offer(0);
                }
            }

            answer += 1;    // 여기까지 1초당 진행 된 일들.
        }

        return answer;
    }
}
