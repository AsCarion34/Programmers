package exhaustive_search.solution03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test01() {
        int brown = 10, yellow = 2;
        assertArrayEquals(new int[] {4, 3}, new Solution().solution(brown, yellow));
    }

    @Test
    void test02() {
        int brown = 8, yellow = 1;
        assertArrayEquals(new int[] {3, 3}, new Solution().solution(brown, yellow));
    }

    @Test
    void test03() {
        int brown = 24, yellow = 24;
        assertArrayEquals(new int[] {8, 6}, new Solution().solution(brown, yellow));
    }

}