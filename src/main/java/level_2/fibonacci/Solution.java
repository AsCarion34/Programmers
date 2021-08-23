package level_2.fibonacci;

import java.util.ArrayList;

public class Solution {

    public int solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            if(i <= 1) {
                answer.add(i);
            }
            else {
                int result = answer.get(i - 1) + answer.get(i - 2);
                answer.add(result % 1234567);
            }
        }
        return answer.get(n);
    }
}
