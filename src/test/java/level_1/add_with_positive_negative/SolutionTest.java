package level_1.add_with_positive_negative;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testEx01() {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        assertEquals(9, new Solution().solution(absolutes, signs));
    }
    @Test
    void testEx02() {
        int[] absolutes = {1,2,3};
        boolean[] signs = {false, false, true};
        assertEquals(0, new Solution().solution(absolutes, signs));
    }
}
