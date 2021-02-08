package level_1.count_of_p_and_y_in_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        String s = "pPoooyY";
        assertTrue(new Solution().solution(s));
    }

    @Test
    void testEx02() {
        String s = "Pyy";
        assertFalse(new Solution().solution(s));
    }
}