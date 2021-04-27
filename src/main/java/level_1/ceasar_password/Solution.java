package level_1.ceasar_password;

public class Solution {
    public String solution(String s, int n) {
        String answer = "";
        // ASCII 로 돌리면 될거 같은데?
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'a' && chars[i] <= 'z') {
                // 소문자 처리
                if(chars[i] + n > 'z') {   // rotation
                    chars[i] = (char) (chars[i] + n - 'z' + 'a' - 1);
                }
                else {
                    chars[i] += n;
                }
            }
            else if(chars[i] >= 'A' && chars[i] <= 'Z') {
                // 대문자 처리
                if(chars[i] + n > 'Z') {    // rotation
                    chars[i] = (char) (chars[i] + n - 'Z' + 'A' - 1);
                }
                else {
                    chars[i] += n;
                }
            }
        }
        answer = String.valueOf(chars);

        return answer;
    }
}
