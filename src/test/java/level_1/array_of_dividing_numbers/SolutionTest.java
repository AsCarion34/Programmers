package level_1.array_of_dividing_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        int[] answer = {5, 10};

        assertArrayEquals(answer, new Solution().solution(arr, divisor));
    }

    @Test
    void testEx02() {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;
        int[] answer = {1, 2, 3, 36};

        assertArrayEquals(answer, new Solution().solution(arr, divisor));
    }

    @Test
    void testEx03() {
        int[] arr = {3, 2, 6};
        int divisor = 10;
        int[] answer = {-1};

        assertArrayEquals(answer, new Solution().solution(arr, divisor));
    }
}