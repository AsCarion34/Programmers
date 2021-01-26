package greedy.solution03;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

public class Solution {
    /***
     * @분석
     * k 만큼 자릿수를 뺴서 가장 큰수를 만들자.
     * 현재 자릿수들 중 가장 작은 수만 k 개를 순차적으로 없애면 되지 않을까?
     * 맨 앞에서부터 탐색하면서 number.length - k 가 가장 큰 수가 되도록 해보자.
     *
     *
     * @param number
     * @param k
     * @return
     */
    public String solution(String number, int k) {
        String answer = "";

        // 우선 숫자형으로 변환
        int[] numbers = Stream.of(number.split("")).mapToInt(Integer::parseInt).toArray();
        // Stack 에 임시로 저장하면서 처리
        Stack<Integer> numberStack = new Stack<>();

        // 숫자를 차례로 Stack 에 넣으면서 다음 숫자가 크면 이전 숫자들 중 역으로 더 큰수를 만날떄까지 빼야한다.
        for(int i = 0; i < numbers.length; i++) {
            while(!numberStack.empty()) {
                // 이미 모든 숫자를 뺐다.
                if(k <= 0) {
                    break;
                }
                if(numberStack.peek() < numbers[i]) {
                    // 스택에 저장 된 숫자가 현재 인덱스보다 크면 해당 숫자는 뺴야 한다.
                    numberStack.pop();
                    k -= 1;
                } else {
                    break;
                }
            }
            numberStack.push(numbers[i]);   // 숫자를 넣어준다.
        }

        // k가 아직 남아있는 경우 - 마지막 것들만 빼주면 된다.
        while(!numberStack.empty()) {
            if(k <= 0) {
                break;
            }
            numberStack.pop();
            k -= 1;
        }

        // 이제 스트링으로 만들어주자.
        answer = Arrays.toString(numberStack.toArray()).replaceAll("[^0-9]","");

        return answer;
    }
}
