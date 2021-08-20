package level_2.correct_parenthesis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void test01() {
        assertTrue(solution.solution("()()"));
    }

    @Test
    public void test02() {
        assertTrue(solution.solution("(())()"));
    }

    @Test
    public void test03() {
        assertFalse(solution.solution(")()("));
    }

    @Test
    public void test04() {
        assertFalse(solution.solution("(()("));
    }

    @Test
    public void test05() {
        assertFalse(solution.solution("(()))(()"));
    }
}