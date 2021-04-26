package level_1.budget;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        // 입력 받은 d 를 정렬하여 적은 것부터 budget 에서 뺴준다.
        // d[i] 가 budget 보다 큰 경우, 직전까지의 count 를 세면 된다.
        int[] sortedArray = Arrays.stream(d).sorted().toArray();
        for (int i : sortedArray) {
            if (i > budget) {
                break;
            }
            budget -= i;
            answer += 1;
        }

        return answer;
    }
}
