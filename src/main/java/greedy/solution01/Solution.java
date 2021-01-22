package greedy.solution01;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    enum Status {
        LOST, NORMAL, RESERVE
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 체육복을 가진 상태를 가진 인덱스를 만든다.
        Status[] statuses = Stream.generate( () -> Status.NORMAL ).limit(n).toArray(Status[]::new);

        // 각 학생의 체육복의 상태를 업데이트 한다.
        for(int num : lost) {
            statuses[num - 1] = Status.LOST;
        }

        for(int num : reserve) {
            if(statuses[num - 1] == Status.LOST) {  // 여벌 학생이 도난당했을 경우 기본으로 처리.
                statuses[num - 1] = Status.NORMAL;
            }
            else {
                statuses[num - 1] = Status.RESERVE;
            }
        }

        // statuses 에서 다음 학생에게 빌려주면서 상태 업데이트.
        // 두번째 번호부터 앞/뒤 학생의 상태를 보면서 업데이트 해야한다.
        for(int i = 1; i < statuses.length; i++) {
            if(statuses[i - 1] == Status.LOST && statuses[i] == Status.RESERVE) {
                // 예외 : 맨 처음 학생이 도난 당한 경우.
                statuses[i - 1] = Status.NORMAL;
                statuses[i] = Status.NORMAL;
                continue;
            }

            if(statuses[i] == Status.LOST) { // 빌려야 되는 상황이다.
                // 앞번호 학생부터 살피자.
                if(statuses[i - 1] == Status.RESERVE) { // 여분이 있다. 빌린다.
                    statuses[i - 1] = Status.NORMAL;
                    statuses[i] = Status.NORMAL;
                    continue;
                }

                if(i + 1 < statuses.length) {
                    if (statuses[i + 1] == Status.RESERVE) {
                        // 뒷번호에게 빌릴 수 있는 경우
                        statuses[i + 1] = Status.NORMAL;
                        statuses[i] = Status.NORMAL;
                        i += 1; // 빌렸으니 뒷번호도 이제 여벌이 없다. 넘어가라.
                        continue;
                    }
                }
            }
        }

        // Normal 상태인 갯수를 센다.
        answer = ((int) Arrays.stream(statuses).filter(s -> s != Status.LOST).count());
        return answer;
    }
}
