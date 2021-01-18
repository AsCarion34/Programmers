package stackqueue.solution01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSolution {

    private Solution solution = new Solution();

    @Test
    public void solution01() {
        int[] tmp = {1, 2, 3, 2, 3};
        Assertions.assertArrayEquals(new int[] {4,3,1,1,0}, solution.solution(tmp));
    }
}
