package sort.solution02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test01() {
        int[] numbers = {6, 10, 2};
        Solution solution = new Solution();
        assertEquals(solution.solution(numbers), "6210");
    }

    @Test
    void test02() {
        int[] numbers = {3, 30, 34, 5, 9};
        Solution solution = new Solution();
        assertEquals(solution.solution(numbers), "9534330");
    }
}