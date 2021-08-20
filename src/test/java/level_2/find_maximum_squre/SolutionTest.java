package level_2.find_maximum_squre;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void test01() {
        assertEquals(9, solution.solution(new int[][]{{0,1,1,1}, {1,1,1,1}, {1,1,1,1}, {0,0,1,0}}));
    }

    @Test
    public void test02() {
        assertEquals(4, solution.solution(new int[][]{{0,0,1,1}, {1,1,1,1}}));
    }
}