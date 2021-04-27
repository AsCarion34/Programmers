package level_1.highest_and_lowest_rankings_of_lotto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testEx01() {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        assertArrayEquals(new int[]{3, 5}, new Solution().solution(lottos, win_nums));
    }
    @Test
    void testEx02() {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        assertArrayEquals(new int[]{1, 6}, new Solution().solution(lottos, win_nums));
    }
    @Test
    void testEx03() {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        assertArrayEquals(new int[]{1, 1}, new Solution().solution(lottos, win_nums));
    }
}
