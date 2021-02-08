package level_1.sorting_your_own_strings;

import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        answer = Arrays.stream(strings).sorted((o1, o2) -> {
            if(o1.charAt(n) != o2.charAt(n)) {
                return Character.compare(o1.charAt(n), o2.charAt(n));
            } else {
                return o1.compareTo(o2);
            }
        }).toArray(String[]::new);

        return answer;
    }
}
