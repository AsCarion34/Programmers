package level_1.reverse_3notation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        int n = 45;
        int result = 7;

        assertEquals(result, new Solution().solution(n));
    }

    @Test
    void testEx02() {
        int n = 125;
        int result = 229;

        assertEquals(result, new Solution().solution(n));
    }
}