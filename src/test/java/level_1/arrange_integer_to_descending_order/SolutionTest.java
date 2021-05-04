package level_1.arrange_integer_to_descending_order;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testEx() {
        long n = 118372;
        assertEquals(873211, new Solution().solution(n));
    }
    @Test
    void testEx01() {
        long n = 203014;
        assertEquals(432100, new Solution().solution(n));
    }
}
