package greedy.Solution06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test01() {
        assertEquals(2, new Solution().solution(new int[][] { {-20, 15}, {-14, -5}, {-18, -13}, {-5, -3}}));
    }
}