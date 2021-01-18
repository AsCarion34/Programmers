package stackqueue.solution04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    class Document {
        int index;
        int priority;

        public Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        // 분석
        // 주어진 중요도가 가장 높은 인덱스를 찾고, 그 앞의 엘레먼트들은 뒤로 넣는다. (Queue 이용하면 될듯)
        // 위 사항을 반복하면서 주어진 기존 location 의 엘레먼트가 몇번째로 dequeue 되는지 리턴한다.

        Queue<Document> docQueue = new LinkedList<>();  // 대기열 큐 생성
        for(int i = 0; i < priorities.length; i++) {
            Document doc = new Document(i, priorities[i]);
            docQueue.offer(doc); // 인덱스와 중요도를 객체로 생성하여 순서대로 넣는다.
        }

        while(!docQueue.isEmpty()) {  // 반복 반복이다.
            boolean bExistBigger = false;
            // 우선 제일 앞의 값을 꺼낸다.
            Document doc = docQueue.poll();
            // 이제 남은 큐에서 자신보다 priority 가 높은게 있는지 본다.
            Iterator<Document> itr = docQueue.iterator();
            while (itr.hasNext()) {
                if(itr.next().priority > doc.priority) {    // 높은 priority 발견. 다시 뒤로 넣어주고 나오자.
                    bExistBigger = true;
                    docQueue.offer(doc);
                    break;
                }
            }

            if(!bExistBigger) { // 이제 맨 앞의 priority보다 큰 문서가 존재하지 않는다.
                if(doc.index == location) {
                    answer = priorities.length - docQueue.size();
                    break;
                }
            }
        }

       return answer;
    }
}
