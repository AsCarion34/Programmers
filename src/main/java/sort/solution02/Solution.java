package sort.solution02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        // 분석.. 이랄것 까지 없는 문제인데.. 효율적인 방안을 고민해보자.
        // 모든 경우의 수를 따질 필요가 없을거 같다.
        // 숫자를 문자형태로 변환하여 정렬한다.

        ArrayList<String> stringNums = new ArrayList<>();
        for(int num : numbers) {
            stringNums.add(String.valueOf(num));    // 숫자를 문자로 변환하여 넣는다.
        }

        // 문자열 기준 정렬을 수행한다.
        Collections.sort(stringNums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        // 0 처리
        if(stringNums.get(0).startsWith("0")) {
            return "0";
        }

        for(String stringNum : stringNums) {
            answer += stringNum;
        }

        return answer;
    }
}
