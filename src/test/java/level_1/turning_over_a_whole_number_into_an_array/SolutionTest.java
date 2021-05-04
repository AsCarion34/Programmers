package level_1.turning_over_a_whole_number_into_an_array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testEx() {
        long n = 12345;
        assertArrayEquals(new int[] {5, 4, 3, 2, 1}, new Solution().solution(n));
    }
}
