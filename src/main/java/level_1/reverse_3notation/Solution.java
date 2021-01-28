package level_1.reverse_3notation;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        /*  최초 풀었던 방식
        String notation = "";
        // n 을 3진법으로 변환한다.
        while(n > 0) {
            notation = (n % 3) + notation;
            n /= 3;
        }
        // 뒤집는다.
        StringBuffer sb = new StringBuffer(notation);
        sb.reverse();

        // 10 진법으로 역계산 하여야 한다.
        // 뒤부터 역으로 가져오면서 3을 곱하여 더한다.
        String tmp = sb.toString();
        answer = Integer.parseInt(String.valueOf(tmp.charAt(tmp.length() - 1)));    // 첫쨰 자리

        int pos = 3;
        for(int i = tmp.length() - 2; i >= 0; i--) {    // 자리 수 마다 제곱의 수를 곱한다.
            answer += Integer.parseInt(String.valueOf(tmp.charAt(i))) * pos;
            pos *= 3;
        }
        */

        /* 방식은 같으나 좀 더 간결하게 */
        String notation = Integer.toString(n, 3);   // 3진수로 바로 변환
        String reversed = new StringBuffer(notation).reverse().toString();  // 뒤집기

        int radix = 0;
        for(int i = reversed.length() - 1; i >= 0; i--) {
            answer += Integer.parseInt(String.valueOf(reversed.charAt(i))) * Math.pow(3, radix);
            radix += 1;
        }

        return answer;
    }
}
