package stackqueue.solution01;

public class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};

        // prices 를 LIFO 로 처리한다.
        // Stack 에 넣고 하나씩 빼면서 다른 List 에 넣으면서, pop 된 값보다 작은 List 의 값의 갯수를 센다.
        answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++) {
            answer[i] = 0;
            for(int j = i + 1; j < prices.length; j++) {
                if(prices[i] <= prices[j]) {
                    answer[i] += 1;
                } else if(prices[i] > prices[j]) {
                    answer[i] += 1;
                    break;
                }
            }
        }
        answer[prices.length - 1] = 0;

        return answer;
    }
}
