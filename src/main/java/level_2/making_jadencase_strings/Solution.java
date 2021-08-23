package level_2.making_jadencase_strings;

public class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        char[] charArray = s.toCharArray();
        boolean isFirst = true;
        for (char c : charArray) {
            if (c == ' ') {
                answer.append(c);
                isFirst = true;
            } else {
                answer.append(isFirst ? Character.toString(c).toUpperCase() : Character.toString(c).toLowerCase());
                if (isFirst) {
                    isFirst = false;
                }
            }
        }

        return answer.toString();
    }
}
