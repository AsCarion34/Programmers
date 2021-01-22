package greedy.solution02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test01() {
        assertEquals(56, new Solution().solution("JEROEN"));
    }

    @Test
    void test02() {
        assertEquals(23, new Solution().solution("JAN"));
    }
}