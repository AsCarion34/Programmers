package level_1.recommand_new_id;

public class Solution {
    /***
     * 분석
     * 문제에 처리 단계와 방법이 다 나와있다.
     *
     * @param new_id
     * @return
     */
    public String solution(String new_id) {
        String answer = "";

        // 1. 소문자 치환
        // 2. 특수문자 제거
        // 3. 마침표가 2번 이상 연속되면 하나로 처리
        answer = new_id.toLowerCase()
                .replaceAll("[^a-z0-9-_.]", "")
                .replaceAll("[.]{2,}", ".");

        // 4. 마침표가 맨 처음이나 끝인경우 제거
        if(answer.startsWith(".")) {
            answer = answer.substring(1);
        }
        if(answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }
        // 5. 빈 문자열인 경우 "a" 대입
        //new_id = new_id.replaceAll(" ", "a");
        answer = answer.isEmpty() ? "a" : answer;
        // 6. 16 자 이상이면 15개만 남김
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        // 추가. 마침표 처리
        if(answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }

        // 7. 2 자 이하이면 마지막 문자를 3 글자가 될 떄까지 이어붙인다.
        if(answer.length() <= 2) {
            char last = answer.charAt(answer.length() - 1);
            while(answer.length() < 3) {
                answer += last;
            }
        }

        return answer;
    }
}
