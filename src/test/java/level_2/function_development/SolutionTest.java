package level_2.function_development;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void test01() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        Assertions.assertArrayEquals(new int[]{2,1}, solution.solution(progresses, speeds));
    }

    @Test
    public void test02() {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        Assertions.assertArrayEquals(new int[]{1, 3, 2}, solution.solution(progresses, speeds));
    }
}