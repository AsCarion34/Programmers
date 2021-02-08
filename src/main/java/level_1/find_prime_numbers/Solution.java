package level_1.find_prime_numbers;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // 에라토스테네스의 체를 활용해보자.
        boolean[] numbers = new boolean[n + 1];
        // 초기화
        for(int i = 2; i <= n; i++) {
            numbers[i] = true;
        }

        for(int i = 2; i <= (int)Math.sqrt(n); i++) {   // 제곱근(루트) 까지 검사한다.
            if(numbers[i]) {
                for(int j = i; i*j <= n; j++) {
                    numbers[i * j] = false; // 배수가 되는 수들은 소수가 아니므로 false 처리.
                }
            }
        }

        // true 인 갯수만 세면 된다.
        for(int i = 2; i <= n; i++) {
            if(numbers[i]) {
                answer += 1;
            }
        }

        return answer;
    }
}
