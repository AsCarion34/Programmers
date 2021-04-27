package level_1.ponketmon;

import java.util.Arrays;

public class Solution {
    public int solution(int[] nums) {
        // 우선 중복을 제거한다.
        // 이후 전체 갯수의 1/2 중 가장 큰 갯수로 반환하면 될 듯.
        return Math.min(Arrays.stream(nums).distinct().toArray().length, nums.length / 2);
    }
}
