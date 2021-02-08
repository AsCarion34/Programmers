package level_1.hate_same_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer = {1, 3, 0, 1};

        assertArrayEquals(answer, new Solution().solution(arr));
    }

    @Test
    void testEx02() {
        int[] arr = {4, 4, 4, 3, 3};
        int[] answer = {4, 3};

        assertArrayEquals(answer, new Solution().solution(arr));
    }
}