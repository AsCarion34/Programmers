package level_1.arrange_integer_to_descending_order;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public long solution(long n) {
        long answer = 0;

        answer = Long.parseLong(
                    String.valueOf(n).chars().mapToObj(c -> (char)c)
                            .sorted(Comparator.reverseOrder())
                            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                            .toString()
                );

        /*
        // 입력 받은 값을 array 로 변환 후 거꾸로 값을 더한다...
        long[] longArray = new long[String.valueOf(n).length()];
        int idx = 0;
        while (n > 0) {
            longArray[idx++] = (n % 10);
            n /= 10;
        }
        Arrays.sort(longArray);

        idx = 1;
        for(long l : longArray) {
            answer += l * idx;
            idx *= 10;
        }
        */

        return answer;
    }
}
