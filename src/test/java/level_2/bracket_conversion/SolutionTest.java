package level_2.bracket_conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public final Solution solution = new Solution();

    @Test
    public void test01() {
        assertEquals("(()())()", solution.solution("(()())()"));
    }

    @Test
    public void test02() {
        assertEquals("()", solution.solution(")("));
    }

    @Test
    public void test03() {
        assertEquals("()(())()", solution.solution("()))((()"));
    }
}