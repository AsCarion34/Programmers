package level_1.basic_of_handling_strings;

public class Solution {
    public boolean solution(String s) {

        // 길이는 단순히 length 로 체크가 가능.
        if(s.length() != 4 && s.length() != 6) {
            return false;
        }
        // 숫자로만 구성되어 있는지는 정규 표현식을 이용한다.
        return s.matches("^[0-9]+$");
    }
}
