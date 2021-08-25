package level_2.kakao_friends_coloring_book;

import java.util.Stack;

public class Solution {
    static int[][] area;
    static boolean[][] visited;
    Stack<Integer> xStack = new Stack<>();
    Stack<Integer> yStack = new Stack<>();

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        area = picture;
        visited = new boolean[m][n];

        return bfs(m, n);
    }

    private int[] bfs(int m, int n) {
        int[] result = new int[2];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int count = 0;
                if(area[i][j] != 0 && !visited[i][j]) {
                    addStack(i, j);
                    count += 1;
                    result[0] += 1;
                }

                while(!xStack.isEmpty()) {
                    int x = xStack.pop();
                    int y = yStack.pop();
                    if(x > 0 && area[x - 1][y] == area[i][j] && !visited[x - 1][y]) {
                        addStack(x - 1, y);
                        count += 1;
                    }
                    if(y > 0 && area[x][y - 1] == area[i][j] && !visited[x][y -1]) {
                        addStack(x, y - 1);
                        count += 1;
                    }
                    if(x < m - 1 && area[x + 1][y] == area[i][j] && !visited[x + 1][y]) {
                        addStack(x + 1, y);
                        count += 1;
                    }
                    if(y < n - 1 && area[x][y + 1] == area[i][j] && !visited[x][y + 1]) {
                        addStack(x, y + 1);
                        count += 1;
                    }
                }
                result[1] = Math.max(result[1], count);
            }
        }
        return result;
    }

    private void addStack(int x, int y) {
        xStack.add(x);
        yStack.add(y);
        visited[x][y] = true;
    }
}
