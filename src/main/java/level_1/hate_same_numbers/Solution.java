package level_1.hate_same_numbers;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        // List에 arr 을 하나씩 넣는다.
        // 넣을 때, 이미 있는 값이면 넣지 않는다.
        ArrayList<Integer> numbersArry = new ArrayList<>();
        for(int num : arr) {
            if(numbersArry.size() == 0) {
                numbersArry.add(num);
                continue;
            }

            if(numbersArry.get(numbersArry.size() - 1) != num) {
                numbersArry.add(num);
            }
        }

        answer = numbersArry.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
