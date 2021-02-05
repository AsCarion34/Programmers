package dfs_bfs.solution04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testEx01() {
        String[][] tickets = {{ "ICN" , "JFK" }, { "HND" , "IAD" }, { "JFK" , "HND" }};
        String[] ret = {"ICN", "JFK", "HND", "IAD"};
        assertArrayEquals(ret, new Solution().solution(tickets));
    }

    @Test
    void testEx02() {
        //String[][] tickets = {{ "ICN" , "SFO" }, { "ICN" , "ATL" }, { "SFO" , "ATL" }, { "ATL" , "ICN" }, { "ATL" , "SFO" }};
        String[][] tickets = {{ "ICN" , "SFO" }, { "ICN" , "ATL" }, { "ATL" , "SFO" }, { "SFO" , "ATL" }, { "ATL" , "ICN" }};
        String[] ret = { "ICN" , "ATL" , "ICN" , "SFO" , "ATL" , "SFO" };
        assertArrayEquals(ret, new Solution().solution(tickets));
    }
}