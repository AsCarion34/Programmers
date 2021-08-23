package level_2.string_compression;

public class Solution {
    /***
     * 반복되는 문자열이 동일한 길이로 되는 경우의 수를 찾아야 한다.
     * 완전 탐색으로 최대 n/2 로 순회하면서 찾아본다.
     */
    public int solution(String s) {
        int answer = s.length();

        if(s.length() == 1) {
            return 1;
        }

        for(int i = 1; i <= s.length() / 2; i++) {  // 전체 문자열의 1/2 만큼 반복하면서...
            int count = 1;  // 압축 된 문자열 갯수
            String subStr = ""; // 부분 문자열
            StringBuilder compStr = new StringBuilder();    // 압축된 문자열

            for(int j = 0; j < s.length() / i; j++) {   // 주어진 범위 내에서 반목한다. O(n^2)
                String tmpString = s.substring(i * j, (i * j) + i);
                // 이전의 부분문자열과 다음 문자열이 같으면 카운트를 올리고 반복한다.
                if(subStr.equals(tmpString)) {
                    count += 1;
                    continue;
                }
                // 갯수가 1 초과하는 경우
                // 압축 문자열을 숫자 + 압축부분문자열로 구성하고 갯수 초기화
               if(count > 1) {
                    compStr.append(count).append(subStr);
                    count = 1;
                }
                else {  // 나머지 문자열 붙여줌
                    compStr.append(subStr);
                }

                subStr = tmpString;   // 부분문자열 재 지정
            }

            if(count > 1) {
                compStr.append(count).append(subStr);
            }
            else {
                compStr.append(subStr);
            }

            if(s.length() % i != 0) {   // 나누어 떨어지지 않는 경우 나머지 문자 붙여넣기
                compStr.append(s.substring(s.length() - s.length() % i));
            }

            answer = Math.min(answer, compStr.length());

        }

        return answer;
    }
}
