package heap.solution02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test01() {
        Solution solution = new Solution();
        int jobs[][] = { {0, 3}, {1, 9}, {2, 6} };

        assertTrue(solution.solution(jobs) == 9);
    }
}