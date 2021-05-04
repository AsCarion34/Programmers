package level_1.add_digits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testEx01() {
        int N = 123;
        assertEquals(6, new Solution().solution(N));
    }

    @Test
    void testEx02() {
        int N = 987;
        assertEquals(24, new Solution().solution(N));
    }
}
