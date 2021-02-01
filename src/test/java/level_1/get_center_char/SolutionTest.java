package level_1.get_center_char;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        String s = "abcde";
        String ret = "c";

        assertEquals(ret, new Solution().solution(s));
    }

    @Test
    void testEx02() {
        String s = "qwer";
        String ret = "we";

        assertEquals(ret, new Solution().solution(s));
    }
}