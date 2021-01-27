package level_1.claw_crane_game;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class Solution {
    /***
     * 분석
     * board 의 정보를 다시 세로 형 stack 이나 queue 로 변환 후 reverse
     * moves 의 순으로 하나씩 해당하는 위치에서 뽑아서 Stack 에 저장
     * 이때 바로 앞 인형과 같으면 카운트 후 pop 한다.
     *
     * @param board
     * @param moves
     * @return
     */
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> bucket = new Stack<>();  //  바구니 스택
        ArrayList<Deque<Integer>> cols = new ArrayList<>(); // board 의 열 스택
        for(int i = 0; i < board[0].length; i++) {  // 미리 Deque 를 만들어 놓는다.
            cols.add(new ArrayDeque<>());
        }

        // 우선 board 의 정보를 Stack 으로 넣는다.
        for(int[] rows : board) {
            for(int i = 0; i < rows.length; i++) {
                if(rows[i] != 0) {
                    cols.get(i).push(rows[i]);
                }
            }
        }

        // 이제 moves 로 하나씩 빼는 대상을 bucket 에 담으면서 계산한다.
        for(int move : moves) {
            if(cols.get(move - 1).isEmpty()) {
                continue;
            }

            int doll = cols.get(move - 1).pollLast();  // move 에 해당하는 Deque 에서 하나 꺼낸다.
            if(bucket.isEmpty()) {  // 비어있으면 그냥 넣는다.
                bucket.push(doll);
                continue;
            }

            if(bucket.peek() == doll) {
                // 넣으려는 인형과 같으면 pop 하고 카운트를 올린다.
                bucket.pop();
                answer += 2;    // 기존 인형과 넣은 인형 카운트.
                continue;
            }

            bucket.push(doll);
        }

        return answer;
    }
}
