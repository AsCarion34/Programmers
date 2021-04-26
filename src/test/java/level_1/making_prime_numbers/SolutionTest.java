package level_1.making_prime_numbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testEx01() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(1, new Solution().solution(nums));
    }
    @Test
    void testEx02() {
        int[] nums = {1, 2, 7, 6, 4};
        assertEquals(4, new Solution().solution(nums));
    }
}
