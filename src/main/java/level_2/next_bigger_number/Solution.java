package level_2.next_bigger_number;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        int count = Integer.bitCount(n);
        answer = n + 1;
        while (count != Integer.bitCount(answer)) {
            answer += 1;
        }

        return answer;
    }
}
