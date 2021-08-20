package level_2.hopscotch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void test01() {
        assertEquals(16, solution.solution(new int[][]{ {1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}}));
    }
}