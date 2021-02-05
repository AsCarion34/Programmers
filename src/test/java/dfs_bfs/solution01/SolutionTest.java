package dfs_bfs.solution01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx() {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        assertEquals(5, new Solution().solution(numbers, target));
    }
}