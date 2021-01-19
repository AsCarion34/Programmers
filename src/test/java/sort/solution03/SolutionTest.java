package sort.solution03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test01() {
        int[] citations = {3, 0, 6, 1, 5};
        Solution solution = new Solution();

        assertEquals(3, solution.solution(citations));
    }
}