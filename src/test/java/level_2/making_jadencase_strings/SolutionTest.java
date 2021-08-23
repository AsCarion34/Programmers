package level_2.making_jadencase_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public final Solution solution = new Solution();

    @Test
    public void test01() {
        assertEquals("3people Unfollowed Me", solution.solution("3people unFollowed me"));
    }

    @Test
    public void test02() {
        assertEquals("For The Last Week", solution.solution("for the last week"));
    }
}