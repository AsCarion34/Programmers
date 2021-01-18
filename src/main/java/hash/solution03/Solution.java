package hash.solution03;

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;

        // category for type
        Map<String, List<String>> map = new HashMap<>();
        for (String[] clothe : clothes) {
            List<String> mapList;
            if (map.containsKey(clothe[1])) {
                mapList = map.get(clothe[1]);
            } else {
                mapList = new ArrayList<>();
            }
            mapList.add(clothe[0]);
            map.put(clothe[1], mapList);
        }

        answer = 1;
        for(String key : map.keySet()) {
            List<String> mapList = map.get(key);
            answer = answer * (mapList.size() + 1);
        }

        return answer - 1;
    }
}
