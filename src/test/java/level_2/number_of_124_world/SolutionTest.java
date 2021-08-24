package level_2.number_of_124_world;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public final Solution solution = new Solution();

    @Test
    public void test01() {
        assertEquals("1", solution.solution(1));
    }

    @Test
    public void test02() {
        assertEquals("2", solution.solution(2));
    }

    @Test
    public void test03() {
        assertEquals("4", solution.solution(3));
    }

    @Test
    public void test04() {
        assertEquals("11", solution.solution(4));
    }
}