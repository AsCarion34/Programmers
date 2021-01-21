package exhaustive_search.solution01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test01() {
        int[] answers = {1, 2, 3, 4, 5};
        Solution solution = new Solution();

        assertArrayEquals(new int[] {1}, solution.solution(answers));
    }

    @Test
    void test02() {
        int[] answers = {1, 3, 2, 4, 2};
        Solution solution = new Solution();

        assertArrayEquals(new int[] {1, 2, 3}, solution.solution(answers));
    }
}