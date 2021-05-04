package level_1.sum_of_factors;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testEx01() {
        int n = 12;
        assertEquals(28, new Solution().solution(n));
    }
    @Test
    void testEx02() {
        int n = 5;
        assertEquals(6, new Solution().solution(n));
    }
}
