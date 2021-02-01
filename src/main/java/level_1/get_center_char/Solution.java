package level_1.get_center_char;

public class Solution {
    public String solution(String s) {
        String answer = "";

        // 글자의 길이를 2로 나눈 값이 가운데 글자 offset 이고, 나머지가 0 이면 짝수이므로 다음 offset 까지 처리해야 한다.
        if(s.length() % 2 == 1) {
            // 홀수인 경우.
            answer = String.valueOf(s.charAt(s.length() / 2));
        } else {
            answer = s.substring( (s.length() / 2) - 1, (s.length() / 2) + 1);
        }

        return answer;
    }
}
