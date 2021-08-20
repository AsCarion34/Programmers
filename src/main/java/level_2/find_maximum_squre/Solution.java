package level_2.find_maximum_squre;

public class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        int[][] boardTmp = new int[board.length + 1][board[0].length + 1];
        for (int i = 0; i < board.length; i++) {
            System.arraycopy(board[i], 0, boardTmp[i + 1], 1, board[0].length);
        }

        for (int i = 1; i < boardTmp.length; i++) {
            for (int j = 1; j < boardTmp[i].length; j++) {
                if (boardTmp[i][j] >= 1) {
                    int left = boardTmp[i - 1][j];
                    int top = boardTmp[i][j - 1];
                    int leftTop = boardTmp[i - 1][j - 1];
                    boardTmp[i][j] = Math.min(Math.min(left, top), leftTop) + 1;
                    answer = Math.max(answer, boardTmp[i][j]);
                }
            }
        }

        return (int) Math.pow(answer, 2);
    }
}
