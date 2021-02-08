package level_1.sorting_your_own_strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        assertArrayEquals(new String[] {"car", "bed", "sun"}, new Solution().solution(strings, n));
    }

    @Test
    void testEx02() {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        assertArrayEquals(new String[] {"abcd", "abce", "cdx"}, new Solution().solution(strings, n));
    }
}