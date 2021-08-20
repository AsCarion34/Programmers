package level_2.maximum_minimum;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        int min = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).min().orElse(0);
        int max = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).max().orElse(0);

        return String.format("%d %d", min, max);
    }
}
