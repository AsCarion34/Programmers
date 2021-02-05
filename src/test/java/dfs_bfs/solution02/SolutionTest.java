package dfs_bfs.solution02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        int n = 3;
        int[][] computers = { {1,1,0}, {1,1,0}, {0,0,1}};

        assertEquals(2, new Solution().solution(n, computers));
    }
    @Test
    void testEx02() {
        int n = 3;
        int[][] computers = { {1,1,0}, {1,1,1}, {0,1,1}};

        assertEquals(1, new Solution().solution(n, computers));
    }
}