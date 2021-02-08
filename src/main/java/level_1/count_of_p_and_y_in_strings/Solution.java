package level_1.count_of_p_and_y_in_strings;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // 대소문자 구분을 하지 않으므로 소문자 치환 후 p 의 갯수와 y 의 갯수를 비교한다.
        // 둘다 하나도 없는 경우 0 == 0 이므로 true 로 자동적으로 처리 됨.
        answer = s.toLowerCase().chars().filter(o -> o == 'p').count() == s.toLowerCase().chars().filter(o -> o == 'y').count();

        return answer;
    }
}
