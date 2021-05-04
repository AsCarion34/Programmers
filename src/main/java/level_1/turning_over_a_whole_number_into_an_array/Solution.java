package level_1.turning_over_a_whole_number_into_an_array;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] solution(long n) {
        // 리스트에 나머지 계산 값을 넣고 나중에 변환..
        List<Integer> digits = new LinkedList<>();
        while(n > 0) {
            digits.add((int) (n % 10));
            n /= 10;
        }

        return digits.stream().mapToInt(i -> i).toArray();
    }
}
