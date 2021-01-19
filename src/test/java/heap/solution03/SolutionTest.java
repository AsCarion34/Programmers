package heap.solution03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void test01() {
        String[] operations = {"I 16", "D 1"};

        assertArrayEquals(new int[] {0, 0}, solution.solution(operations));
    }

    @Test
    void test02() {
        String[] operations = { "I 7", "I 5", "I -5", "D -1" };

        assertArrayEquals(new int[] {7, 5}, solution.solution(operations));
    }

    @Test
    void test03() {
        String[] operations = { "I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1" };

        assertArrayEquals(new int[] {0, 0}, solution.solution(operations));
    }

    @Test
    void test04() {
        String[] operations = { "I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333" };

        assertArrayEquals(new int[] {333, -45}, solution.solution(operations));
    }
}