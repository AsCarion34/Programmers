package level_2.least_common_multiples_of_n;

public class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int k : arr) {
            answer = lcm(answer, k);
        }
        return answer;
    }

    private static int gcd(int a, int b) {
        while(b != 0) {
            int result = a % b;
            a = b;
            b = result;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
