package hash.solution02;

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        ////////////////////
        // Exception
        if(phone_book.length < 1 || phone_book.length > 1000000) {
            return false;
        }
        ///////////////////

        HashMap<String, Integer> numMap = new HashMap<String, Integer>();
        for(int i = 0; i < phone_book.length; i++) {
            // phone_book 의 원소를 하나씩 map 에 넣으면서,
            // map 의 key 에 해당하는 phone_book의 원소가 접두어가 되는지 확인하면서 넣는다.
            for(String key : numMap.keySet()) {
                if(phone_book[i].startsWith(key) || key.startsWith(phone_book[i])) {
                    return false;
                }
            }
            numMap.put(phone_book[i], 0);
        }

        return answer;
    }
}
