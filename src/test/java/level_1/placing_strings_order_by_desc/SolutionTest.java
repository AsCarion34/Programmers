package level_1.placing_strings_order_by_desc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testEx01() {
        String s = "Zbcdefg";
        assertEquals("gfedcbZ", new Solution().solution(s));
    }
}