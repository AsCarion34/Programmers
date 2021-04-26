package level_1.budget;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void testEx01() {
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;

        assertEquals(3, new Solution().solution(d, budget));
    }

    @Test
    void testEx02() {
        int[] d = {2, 2, 3, 3};
        int budget = 10;

        assertEquals(4, new Solution().solution(d, budget));
    }
}
