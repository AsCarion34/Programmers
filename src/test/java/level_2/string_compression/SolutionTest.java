package level_2.string_compression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public final Solution solution = new Solution();

    @Test
    public void test01() {
        assertEquals(7, solution.solution("aabbaccc"));
    }

    @Test
    public void test02() {
        assertEquals(9, solution.solution("ababcdcdababcdcd"));
    }

    @Test
    public void test03() {
        assertEquals(8, solution.solution("abcabcdede"));
    }

    @Test
    public void test04() {
        assertEquals(14, solution.solution("abcabcabcabcdededededede"));
    }

    @Test
    public void test05() {
        assertEquals(17, solution.solution("xababcdcdababcdcd"));
    }
}