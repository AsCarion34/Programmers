package level_1.ponketmon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testEx01() {
        int[] nums = {3, 1, 2, 3};
        assertEquals(2, new Solution().solution(nums));
    }
    @Test
    void testEx02() {
        int[] nums = {3, 3, 3, 2, 2, 4};
        assertEquals(3, new Solution().solution(nums));
    }
    @Test
    void testEx03() {
        int[] nums = {3, 3, 3, 2, 2, 2};
        assertEquals(2, new Solution().solution(nums));
    }
}
