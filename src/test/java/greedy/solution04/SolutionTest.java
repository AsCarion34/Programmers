package greedy.solution04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test01() {
        assertEquals(3, new Solution().solution(new int[] {70, 50, 80, 50}, 100));
    }

    @Test
    void test02() {
        assertEquals(3, new Solution().solution(new int[] {70, 80, 50}, 100));
    }
}