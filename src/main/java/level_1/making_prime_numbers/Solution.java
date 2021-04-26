package level_1.making_prime_numbers;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int num = (int)Math.sqrt(sum);
                    while(num > 1) {
                        if (sum % num == 0) {
                            break;
                        }
                        num--;
                    }
                    if(num == 1) {
                        answer += 1;
                    }
                }
            }
        }

        return answer;
    }
}
