package level_1.find_kim_in_seoul;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        String[] seoul = {"Jane", "Kim"};
        assertEquals("김서방은 1에 있다", new Solution().solution(seoul));
    }
}