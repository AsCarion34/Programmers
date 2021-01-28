package level_1.recommand_new_id;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String result = "bat.y.abcdefghi";
        assertEquals(result, new Solution().solution(new_id));
    }

    @Test
    void testEx02() {
        String new_id = "z-+.^.";
        String result = "z--";
        assertEquals(result, new Solution().solution(new_id));
    }

    @Test
    void testEx03() {
        String new_id = "=.=";
        String result = "aaa";
        assertEquals(result, new Solution().solution(new_id));
    }

    @Test
    void testEx04() {
        String new_id = "123_.def";
        String result = "123_.def";
        assertEquals(result, new Solution().solution(new_id));
    }

    @Test
    void testEx05() {
        String new_id = "abcdefghijklmn.p";
        String result = "abcdefghijklmn";
        assertEquals(result, new Solution().solution(new_id));
    }
}