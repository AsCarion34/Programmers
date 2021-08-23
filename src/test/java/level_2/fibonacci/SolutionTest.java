package level_2.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void test01() {
        assertEquals(2, solution.solution(3));
    }

    @Test
    public void test02() {
        assertEquals(5, solution.solution(5));
    }
}