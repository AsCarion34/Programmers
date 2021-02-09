package level_1.changing_strings_to_integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        String str = "1234";
        assertEquals(1234, new Solution().solution(str));
    }

    @Test
    void testEx02() {
        String str = "-1234";
        assertEquals(-1234, new Solution().solution(str));
    }
}