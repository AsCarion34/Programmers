package dynamic_programming.solution01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test01() {
        assertEquals(4, new Solution().solution(5, 12));
    }

    @Test
    void test02() {
        assertEquals(3, new Solution().solution(2, 11));
    }

    @Test
    void test09() {
        assertEquals(1, new Solution().solution(5, 5));
    }
}