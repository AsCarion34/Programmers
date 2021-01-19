package heap.solution01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test01() {
        Solution solution = new Solution();
        int[] scoville = {1,2,3,9,10,12};
        int k = 7;

        assertTrue(solution.solution(scoville, k) == 2);
    }

}