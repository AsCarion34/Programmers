package level_1.year2016;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        int a = 5;
        int b = 24;

        assertEquals("TUE", new Solution().solution(a, b));
    }
}