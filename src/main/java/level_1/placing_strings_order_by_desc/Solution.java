package level_1.placing_strings_order_by_desc;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String s) {
        String answer = "";
        // char stream -> reverse sort -> string
        answer = s.chars().mapToObj(c -> (char)c).sorted(Comparator.reverseOrder()).map(String::valueOf).collect(Collectors.joining());
        return answer;
    }
}
