package level_2.maximum_minimum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void test01() {
        assertEquals("1 4", solution.solution("1 2 3 4"));
    }

    @Test
    public void test02() {
        assertEquals("-4 -1", solution.solution("-1 -2 -3 -4"));
    }

    @Test
    public void test03() {
        assertEquals("-1 -1", solution.solution("-1 -1"));
    }
}