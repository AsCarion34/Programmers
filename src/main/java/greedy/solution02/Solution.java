package greedy.solution02;

public class Solution {
    public int solution(String name) {
        int answer = 0;
        // 우선 A 가 아닌 문자열에 대한 최소 값을 구한다.
        int modCount = name.codePoints().filter(c -> c != 'A').map(i -> Math.min((char) i - 'A', ('Z' - (char) i) + 1)).sum();

        // 이동 횟수의 최소값을 구해야 한다.
        int moveCnt = name.length() - 1;
        for(int i = 0; i < name.length(); i++) {
            int idx = i;
            if(name.charAt(idx) != 'A') {
                continue;
            }

            while(idx < name.length() && name.charAt(idx) == 'A') {
                idx += 1;
            }
            int backCnt = ((i - 1) * 2) + name.length() - idx;
            moveCnt = Math.min(moveCnt, backCnt);
        }

        answer += moveCnt + modCount;

        return answer;
    }
}
