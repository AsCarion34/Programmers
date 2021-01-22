package greedy.solution01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test01() {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        assertEquals(5, new Solution().solution(n, lost, reserve));
    }

    @Test
    void test02() {
        int n = 5;
        int[] lost = {2, 3};
        int[] reserve = {3};

        assertEquals(4, new Solution().solution(n, lost, reserve));
    }

    @Test
    void test03() {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};

        assertEquals(2, new Solution().solution(n, lost, reserve));
    }
}