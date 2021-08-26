package level_2.skill_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void test01() {
        assertEquals(2, solution.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));
    }
}