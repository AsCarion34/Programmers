package level_2.make_minimum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void test01() {
        assertEquals(29, solution.solution(new int[] {1, 4, 2}, new int[] {5, 4, 4}));
    }

    @Test
    public void test02() {
        assertEquals(10, solution.solution(new int[] {1, 2}, new int[] {3, 4}));
    }
}