package dynamic_programming.solution04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx() {
        int[] money = {1, 2, 3, 1};
        assertEquals(4, new Solution().solution(money));
    }
}