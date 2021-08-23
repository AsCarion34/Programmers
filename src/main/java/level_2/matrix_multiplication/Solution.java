package level_2.matrix_multiplication;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int row = 0; row < arr1.length; row++) {
            for(int col = 0; col < arr2[0].length; col++) {
                int result = 0;
                for(int i =0; i < arr1[row].length; i++) {
                    result += arr1[row][i] * arr2[i][col];
                }
                answer[row][col] = result;
            }
        }

        return answer;
    }
}
