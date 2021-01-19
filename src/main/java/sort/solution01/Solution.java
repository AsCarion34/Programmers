package sort.solution01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        // 분석
        // 배열을 주어진 인덱스로 자른 후 sort 하여 주어진 index 의 값들을 배열로 리턴한다.

        // 우선, commands 의 갯수만큼 반복하여야 한다.
        answer = new int[commands.length];
        int idx = 0;    // answer 의 인덱스
        for(int[] command : commands) {
            // command 의 [0] ~ [1] 번째 원소들을 분리한다.
            ArrayList<Integer> splitList = new ArrayList<>();
            for(int i = command[0] - 1; i < command[1]; i++) {
                splitList.add(array[i]);
            }
            // ArrayList 를 정렬하자. (오름차순)
            Collections.sort(splitList, Comparator.comparingInt(s -> s));
            answer[idx++] = splitList.get(command[2] - 1);
        }

        return answer;
    }
}
