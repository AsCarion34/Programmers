package level_1.create_weird_characters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testEx() {
        String s = " try hello world " ;
        assertEquals(" TrY HeLlO WoRlD ", new Solution().solution(s));
    }
}
