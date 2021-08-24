package level_2.open_chat_room;

import java.util.*;

public class Solution {
    /***
     * 두 단계로 나누어 진행한다.
     * 1) uid 기준으로 입장/퇴장을 list 로 변환하면서 저장한다.
     * 2) uid 별로 닉네임을 매칭시키는 자료구조를 만든다.
     */
    public String[] solution(String[] record) {
        List<String[]> historyList = new ArrayList<>();
        Map<String, String> nickMap = new HashMap<>();

        for(String row : record) {
            String[] data = row.split(" ");
            if(data[0].equals("Enter")) {
                historyList.add(new String[] {data[1], "님이 들어왔습니다."});
                nickMap.put(data[1], data[2]);
            }
            else if(data[0].equals("Leave")) {
                historyList.add(new String[] {data[1], "님이 나갔습니다."});
            }
            else {
                nickMap.put(data[1], data[2]);
            }
        }

        return historyList.stream().map(hist -> String.format("%s%s", nickMap.get(hist[0]), hist[1])).toArray(String[]::new);
    }
}