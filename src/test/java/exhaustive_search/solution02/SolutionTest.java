package exhaustive_search.solution02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test01() {
        String members = "17";
        Solution solution = new Solution();

        assertEquals(3, solution.solution(members));
    }

    @Test
    void test02() {
        String members = "011";
        Solution solution = new Solution();

        assertEquals(2, solution.solution(members));
    }

    @Test
    void test03() {
        String members = "2134";    // 2, 3, 13, 23, 41, 43, 241,
        Solution solution = new Solution();
        solution.solution(members);
        //assertEquals(2, solution.solution(members));
    }
}