package greedy.solution03;

import java.util.stream.Stream;

public class Solution {
    /***
     * @분석
     * k 만큼 자릿수를 뺴서 가장 큰수를 만들자.
     * 현재 자릿수들 중 가장 작은 수만 k 개를 순차적으로 없애면 되지 않을까?
     *
     * @param number
     * @param k
     * @return
     */
    public String solution(String number, int k) {
        String answer = "";

        // 우선 숫자형으로 변환
        int[] numbers = Stream.of(number).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i > k; i++) {

        }


        return answer;
    }
}
