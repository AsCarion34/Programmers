package sort.solution01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test01() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = { {2, 5, 3}, {4, 4, 1}, {1, 7, 3} };

        Solution solution = new Solution();
        assertArrayEquals(new int[] {5, 6,3}, solution.solution(array, commands));
    }

}