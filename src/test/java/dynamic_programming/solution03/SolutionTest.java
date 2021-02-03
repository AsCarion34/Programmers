package dynamic_programming.solution03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx() {
        int m = 4;
        int n = 3;
        int[][] puddles = {{2, 2}};

        assertEquals(4, new Solution().solution(m, n, puddles));
    }
}