package level_2.next_bigger_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test01() {
        assertEquals(83, solution.solution(78));
    }

    @Test
    public void test02() {
        assertEquals(23, solution.solution(15));
    }
}