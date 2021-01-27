package level_1.add_with_pick_two_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        int[] numbers = {2, 1, 3, 4, 1};
        assertArrayEquals(new int[] {2, 3, 4, 5, 6, 7}, new Solution().solution(numbers));
    }

    @Test
    void testEx02() {
        int[] numbers = {5,0,2,7};
        assertArrayEquals(new int[] {2,5,7,9,12}, new Solution().solution(numbers));
    }
}