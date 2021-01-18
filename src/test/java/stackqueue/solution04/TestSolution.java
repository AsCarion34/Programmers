package stackqueue.solution04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSolution {

    private Solution solution = new Solution();

    @Test
    void test01() {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        assertTrue(solution.solution(priorities, location) == 1);
    }

    @Test
    void test02() {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        assertTrue(solution.solution(priorities, location) == 5);
    }
}