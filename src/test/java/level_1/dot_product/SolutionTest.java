package level_1.dot_product;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testEx01() {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        assertEquals(3, new Solution().solution(a, b));
    }
    @Test
    void testEx02() {
        int[] a = {-1, 0, 1};
        int[] b = {1, 0, -1};
        assertEquals(-2, new Solution().solution(a, b));
    }
}
