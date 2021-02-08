package level_1.array_of_dividing_numbers;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        answer = Arrays.stream(arr).filter(n -> n % divisor == 0).sorted().toArray();
        return answer.length != 0 ? answer : new int[] {-1};
    }
}
