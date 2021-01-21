package exhaustive_search.solution01;

import java.util.*;

public class Solution {
    /***
     * @분석
     *   3명의 수포자가 가진 패턴으로 주어진 배열과 맞는 카운트를 세어야 한다.
     *   answer 배열을 순회하면서 각 수포자의 정답과 동일한 인덱스의 값을 체크하여 갯수를 세어야 한다.
     *
     * @param answers
     * @return int[] : 가장 많은 문제를 맞힌 사람 (중복일 경우 오름차순 정렬_
     */
    public int[] solution(int[] answers) {
        int[] answer = {};
        // 각 수포자 별 패턴 배열
        int[][] person = { {1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5} };
        // 각 수포자 별 정답 갯수 배열
        int[] correct = {0, 0, 0};

        // 문제 배열을 순회하면서 각 수포자의 패턴과 맞는 경우 정답 갯수를 카운트 한다.
        for(int i = 0; i < answers.length; i++) {   // 문제의 정답을 순회
            for(int j = 0; j < person.length; j++) {    // 각 수포자를 순회 (person 을 3명으로 각각 처리해도 된다.)
                if(answers[i] == person[j][i % person[j].length]) { // 패턴 순서로 매칭하기 위해 % 로 인덱스를 찾는다.
                    correct[j] += 1;
                }
            }
        }

        // 수포자 별 정답 갯수 중 가장 큰 수를 찾는다.
        int maxCorrect = 0;
        for(int i = 0; i < correct.length; i++) {
            maxCorrect = Math.max(correct[i], maxCorrect);
        }

        // 정답 갯수가 많은 수포자의 인덱스를 찾는다.
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < correct.length; i++) {
            if(correct[i] == maxCorrect) {
                list.add(i + 1);    // 수포자의 번호이므로 인덱스 + 1
            }
        }

        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
