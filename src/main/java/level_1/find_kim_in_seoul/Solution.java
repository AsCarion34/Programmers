package level_1.find_kim_in_seoul;

import java.util.stream.IntStream;

public class Solution {
    public String solution(String[] seoul) {
        String answer = "";

        int pos = IntStream.range(0, seoul.length)
                .filter(i -> seoul[i].equals("Kim"))
                .findFirst()
                .orElse(0);

        answer = String.format("김서방은 %d에 있다", pos);

        return answer;
    }
}
