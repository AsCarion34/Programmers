package greedy.solution04;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.IntStream;

public class Solution {
    /***
     * @분석
     * 가장 최소의 횟수가 되려면, 가장 큰 수와 가장 작은수의 조합으로 찾아서 진행하여야 한다.
     * 사람들을 몸무게 순으로 정렬 후, 맨 앞과 맨 뒤의 수를 확인하여 가장 무거운 사람을 기준으로 갯수를 센다.
     * 양방향 Queue 를 사용하면 어떨까?
     *
     * @param people
     * @param limit
     * @return
     */
    public int solution(int[] people, int limit) {
        int answer = 0;

        // 우선 주어진 몸무게를 정렬한다.
        Arrays.sort(people);    // 오름차순 정렬이 됨.
        // Deque 를 사용해보자.
        Deque<Integer> peopleDq = new ArrayDeque<>();
        IntStream.of(people).forEach(peopleDq::add);    // Deque에 우선 저장.

        while(!peopleDq.isEmpty()) {
            // Deque 를 돌면서 제일 처음 값과 마지막 값을 비교해야 한다.
            if(peopleDq.peekFirst() + peopleDq.peekLast() > limit) {
                // 최소값과 최대값이 limit 보다 크므로, 최대값을 하나 뺀다.
                peopleDq.pollLast();
            } else {
                // 최대 2명이므로 최소값과 최대값을 빼준다.
                peopleDq.pollFirst();
                peopleDq.pollLast();
            }
            answer += 1;    // 카운트 해준다.
        }

        return answer;
    }
}
