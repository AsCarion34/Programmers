package level_1.create_weird_characters;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        String answer = "";

        // 전체 String 을 Char 배열로 바꾸어서 하나씩 처리하자.
        char[] chars = s.toCharArray();
        int idx = 0;

        for(int i = 0; i < chars.length; i++) {
            chars[i] = (idx % 2 == 0) ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]);
            idx = (chars[i] == ' ') ? 0 : idx + 1;    // 공백의 경우는 인덱스 초기화, 아닌 경우 인덱스 시작
        }
        answer = String.valueOf(chars);

        return answer;
    }
}
