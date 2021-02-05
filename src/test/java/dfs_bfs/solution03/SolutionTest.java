package dfs_bfs.solution03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        assertEquals(4, new Solution().solution(begin, target, words));
    }

    @Test
    void testEx02() {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log"};

        assertEquals(0, new Solution().solution(begin, target, words));
    }
}