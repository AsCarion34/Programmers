package stackqueue.solution03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSolution {
    private Solution solution = new Solution();

    @Test
    public void test01() {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        Assertions.assertTrue(solution.solution(bridge_length, weight, truck_weights) == 8);
    }

    @Test
    public void test02() {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10};

        Assertions.assertTrue(solution.solution(bridge_length, weight, truck_weights) == 101);
    }

    @Test
    public void test03() {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

        Assertions.assertTrue(solution.solution(bridge_length, weight, truck_weights) == 110);
    }
}
