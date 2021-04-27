package level_1.ceasar_password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testEx01() {
        String s = "AB";
        int n = 1;
        assertEquals("BC", new Solution().solution(s, n));
    }
    @Test
    void testEx02() {
        String s = "z";
        int n = 1;
        assertEquals("a", new Solution().solution(s, n));
    }
    @Test
    void testEx03() {
        String s = "a B z";
        int n = 4;
        assertEquals("e F d", new Solution().solution(s, n));
    }
}
