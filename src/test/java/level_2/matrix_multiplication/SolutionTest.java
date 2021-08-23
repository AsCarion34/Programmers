package level_2.matrix_multiplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public final Solution solution = new Solution();

    @Test
    public void test01() {
        assertArrayEquals(new int[][] {{15, 15}, {15, 15}, {15, 15}},
                solution.solution(new int[][] {{1, 4}, {3, 2}, {4, 1}}, new int[][] {{3, 3}, {3, 3}}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[][] {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}},
                solution.solution(new int[][] {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][] {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}}));
    }
}