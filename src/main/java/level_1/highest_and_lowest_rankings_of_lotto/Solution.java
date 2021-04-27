package level_1.highest_and_lowest_rankings_of_lotto;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};

        // 두 배열을 정렬 후 각 인덱스 별로 값을 비교
        // lottos 의 해당 인덱스의 값이 0 인 경우 모두 맞거나 모두 틀린 경우로 판단한다.
        int correctedCount = (int)IntStream.range(0, lottos.length).filter( i -> Arrays.stream(win_nums).anyMatch(o -> o == lottos[i]) ).count();
        int zeroCount = (int) Arrays.stream(lottos).filter(o -> o == 0).count();

        // 맞춘 갯수 + 0 갯수 = 최대 맞춘 경우의 수
        // 맞춘 갯수 = 최소 맞춘 경우의 수

        answer = new int[] {getRank(correctedCount + zeroCount), getRank(correctedCount)};

        return answer;
    }

    private int getRank(int count) {
        if(count >= 2) {
            return 7 - count;
        }
        return 6;
    }
}
