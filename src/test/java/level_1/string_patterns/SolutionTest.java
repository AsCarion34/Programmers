package level_1.string_patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        int n = 3;
        assertEquals("수박수", new Solution().solution(n));
    }

    @Test
    void testEx02() {
        int n = 4;
        assertEquals("수박수박", new Solution().solution(n));
    }
}