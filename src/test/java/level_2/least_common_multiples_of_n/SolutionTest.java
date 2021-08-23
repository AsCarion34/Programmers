package level_2.least_common_multiples_of_n;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public final Solution solution = new Solution();

    @Test
    public void test01() {
        assertEquals(168, solution.solution(new int[] { 2, 6, 8, 14}));
    }

    @Test
    public void test02() {
        assertEquals(6, solution.solution(new int[] { 1, 2, 3}));
    }
}