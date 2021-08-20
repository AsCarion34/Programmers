package level_2.correct_parenthesis;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    boolean solution(String s) {
        if(s.length() == 0)
            return false;

        char[] braceArray = s.toCharArray();

        if(braceArray[0] != '(' && braceArray[braceArray.length - 1] != ')') {
            return false;
        }

        // Queue 를 이용하여 넣고 빼면서 처리한다.
        Queue<Character> queue = new LinkedList<>();
        queue.offer(braceArray[0]);
        for(int i = 1; i < braceArray.length; i++) {
            if(queue.size() == 0) {
                queue.offer(braceArray[i]);
                continue;
            }

            if(braceArray[i] == ')' && queue.peek() == '(') {
                queue.poll();
            }
            else {
                queue.offer(braceArray[i]);
            }
        }

        return queue.size() == 0;
    }
}
