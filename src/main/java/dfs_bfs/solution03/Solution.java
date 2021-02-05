package dfs_bfs.solution03;

public class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = words.length + 1;

        for(int i = 0; i < words.length; i++) {
            boolean[] visited = new boolean[words.length];
            if(1 == stringCharCompare(begin, words[i])) {
                answer = Math.min(answer, dfs(words[i], target, words, i, visited, 1));
            }
        }

        return answer == words.length + 1 ? 0 : answer;
    }

    private int dfs(String begin, String target, String[] words, int index, boolean[] visited, int count) {
        if(begin.equals(target) || visited[index]) {
            return count;
        }

        visited[index] = true;
        int ret = 0;
        for(int i = 0; i < words.length; i++) {
            if(index != i && 1 == stringCharCompare(begin, words[i]) && !visited[i]) {
                ret = dfs(words[i], target, words, i, visited, count + 1);
            }
        }

        return ret;
    }

    private int stringCharCompare(String str1, String str2) {
        int count = 0;
        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                count += 1;
            }
        }
        return count;
    }
}
