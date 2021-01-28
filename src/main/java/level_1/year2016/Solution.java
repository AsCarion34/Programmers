package level_1.year2016;

public class Solution {
    /***
     * 분석
     * 기존 DateTime 으로 처리하면 금방 하겠지..
     * 그래도.. 월별 날짜를 만들어서 시작 날짜/요일 로 계산해보자.
     *
     * @param a
     * @param b
     * @return
     */
    public String solution(int a, int b) {
        String answer = "";

        String[] dayOfYear = new String[366];
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 2월 윤년
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // 1/1 금요일부터.. 날짜 별 요일을 인덱스 한다.
        for(int i = 0; i < dayOfYear.length; i++) {
            dayOfYear[i] = day[(i+5)%7];
        }

        // 원하는 전월 까지를 날짜로 환산
        int total = 0;
        for(int i = 0; i < a - 1; i++) {
            total += month[i];
        }

        // 원하는 월의 날짜 만큼 더한다.
        answer = dayOfYear[total + b - 1];  // 1월 1일 기준으로 하여야 함.

        return answer;
    }
}
