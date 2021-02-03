package dynamic_programming.solution04;

public class Solution {
    public int solution(int[] money) {
        int answer = 0;

        int[] target1 = new int[money.length - 1]; // 0 : 첫번째 집부터, 1 : 두번쨰 집부터
        int[] target2 = new int[money.length];
        target1[0] = money[0];   // 첫번째 돈
        target1[1] = money[0];   // 두번째는 포함되지 않음
        target2[0] = 0;
        target2[1] = money[1];   // 두번째 돈
        // targets[n] 에 각각 money 를 더해가며 마지막 값을 참고하게 한다.
        for(int i = 2; i < target1.length; i++) {
            target1[i] = Math.max(target1[i - 2] + money[i], target1[i - 1]);
        }
        for(int i = 2; i < target2.length; i++) {
            target2[i] = Math.max(target2[i - 2] + money[i], target2[i - 1]);
        }

        answer = Math.max(target1[target1.length - 1], target2[target2.length - 1]);

        return answer;
    }
}
