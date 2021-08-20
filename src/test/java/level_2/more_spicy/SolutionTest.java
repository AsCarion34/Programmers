package level_2.more_spicy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test01() {
        Solution solution = new Solution();
        int[] scoville = {1,2,3,9,10,12};
        int k = 7;

        assertEquals(2, solution.solution(scoville, k));
    }
}