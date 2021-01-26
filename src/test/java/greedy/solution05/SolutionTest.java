package greedy.solution05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test01() {
        assertEquals(4, new Solution().solution(4, new int[][] {{0, 1, 1}, {0,2,2}, {1,2,5}, {1,3,1}, {2,3,8}}));
    }
}