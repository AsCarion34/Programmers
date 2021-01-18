package hash.solution01;
import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //////////////////////////////
        // Exception
        if(participant.length > 100000) {
            return answer;
        }

        if(participant.length - 1 != completion.length) {
            return answer;
        }
        ///////////////////////////////

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for(i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[i];
    }
}