package level_1.find_prime_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        int n = 10;
        assertEquals(4, new Solution().solution(n));
    }
    @Test
    void testEx02() {
        int n = 5;
        assertEquals(3, new Solution().solution(n));
    }
}