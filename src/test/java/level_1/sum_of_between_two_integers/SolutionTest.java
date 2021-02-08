package level_1.sum_of_between_two_integers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        int a = 3;
        int b = 5;

        assertEquals(12, new Solution().solution(a, b));
    }
    @Test
    void testEx02() {
        int a = 3;
        int b = 3;

        assertEquals(3, new Solution().solution(a, b));
    }
    @Test
    void testEx03() {
        int a = 5;
        int b = 3;

        assertEquals(12, new Solution().solution(a, b));
    }
}