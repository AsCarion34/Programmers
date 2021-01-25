package greedy.solution03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test01() {
        assertEquals("94", new Solution().solution("1924", 2));
    }

    @Test
    void test02() {
        assertEquals("3234", new Solution().solution("1231234", 3));
    }

    @Test
    void test03() {
        assertEquals("775841", new Solution().solution("4177252841", 4));
    }
}