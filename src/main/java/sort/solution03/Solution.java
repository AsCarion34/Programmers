package sort.solution03;

import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        // 분석
        // 주어진 배열 = 논문 갯수 n = 인용횟수 h 원소 집합.
        // 내림차순 정렬 후에 후위 순회를 하면서 순회 갯수 보다 작은 숫자인 경우 순회 갯수 카운트.

        // Stream 을 이용하여 정렬
        int[] sortedArry = Arrays.stream(citations).sorted().toArray();
        for(int i = sortedArry.length - 1; i >= 0; i--) {
            if(sortedArry[i] <= answer) {
                break;
            }
            answer += 1;
        }

        return answer;
    }

    // 다른 풀이
    // 원소의 값은 점점 감소하고, 원소의 값 이상인 것의 갯수 또한 감소하므로, 이 두 값의 최소값의 변화가 증가 하다가 감소하는 지점이 답이다.
    public int anotherSolution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        for(int i = citations.length - 1; i >= 0; i--) {
            int min = Math.min(citations[i], citations.length - i);
            answer = Math.max(answer, min);
        }

        return answer;
    }
}
