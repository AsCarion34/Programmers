package level_1.add_with_pick_two_numbers;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    /***
     * 분석
     * numbers 를 오름차순 정렬
     * 맨 앞 인덱스의 값을 나머지 값들과 더한 결과를 오름차순으로 만든다.
     * 1) 다음 값이 동일한 경우 덧셈 결과를 구하고 pass. (다음 값으로 다시 처리하면 됨)
     * 2) 중복 방지를 위해 Set 을 이용한다.
     *
     * @param numbers
     * @return
     */
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> results = new HashSet<>(); // 결과를 저장하기 위한 컬렉션

        // numbers를 오름차순 정렬
        Arrays.sort(numbers);
        // 순회하면서 처리한다.
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                results.add(numbers[i] + numbers[j]);   // 동일한 값이 연속 되더라도 중복 저장 되지 않는다.
                if(numbers[i] == numbers[j]) {  // 다음 값이 동일하므로 값을 구하고 다음 값으로 다시 반복.
                    break;
                }
            }
        }

        answer = results.stream().sorted().mapToInt(Number::intValue).toArray();
        Arrays.sort(answer);

        return answer;
    }
}
