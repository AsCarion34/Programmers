package level_1.basic_of_handling_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        String s = "a234";
        assertEquals(false, new Solution().solution(s));
    }

    @Test
    void testEx02() {
        String s = "1234";
        assertEquals(true, new Solution().solution(s));
    }
}