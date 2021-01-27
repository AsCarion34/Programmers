package dynamic_programming.solution01;

import java.util.*;

public class Solution {
    /***
     * @분석
     * 주어진 N 만 가지고 사칙연산을 통해 만들 수 있는 방법 중 N이 최소 갯수인 경우의 수를 찾는다.
     * 최소값이 8보다 크면 -1 반.. N은 1 <= N <= 9
     *
     * 1) N 이 한개인 경우 : N
     * 2) N 이 두개인 경우: NN, 1) 을 이용한 사칙연산들 = N+N, N-N, N*N, N-N
     * 3) N 이 n개인 경우: NNN..n,
     *                  N결과 <사칙연산> N-1결과,
     *                  N(2)결과 <사칙연산> N-2결과,
     *                  ...
     *                  N(n-1)결과 <사칙연산> N결
     *
     * @param N
     * @param number
     * @return
     */
    public int solution(int N, int number) {
        int answer = -1;

        if(N == number) {
            return 1;
        }

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        // 1개인 경우 미리 처리.
        HashSet<Integer> firstSet = new HashSet<>();
        firstSet.add(N);
        map.put(1, firstSet);

        loop : for(int i = 2; i < 9; i++) {
            HashSet<Integer> set = new LinkedHashSet<>();
            int Nn = Integer.parseInt(Integer.toBinaryString((int)Math.pow(2, i) - 1)) * N;
            if(Nn == number) {
                return i;
            }
            set.add(Nn);
            for(int j = 1; j <= i / 2; j++) {
                for(Integer u1 : map.get(j)) {
                    for(Integer u2 : map.get(i - j)) {
                        for(Operator o : Operator.values()) {
                            int calc = o.calculate(u1, u2);
                            if(calc == number) {
                                answer = i;
                                break loop;
                            }
                            set.add(calc);
                        }
                    }
                }
            }
            map.put(i, set);
        }

        return answer;
    }

    enum Operator {
        PLUS {
            @Override
            public int calculate(int i, int j) {
                return i + j;
            }
        }, MINUS {
            @Override
            public int calculate(int i, int j) {
                return i - j;
            }
        }, BACKMINUS {
            @Override
            public int calculate(int i, int j) {
                return j - i;
            }
        }, MUL {
            @Override
            public int calculate(int i, int j) {
                return i * j;
            }
        }, DIV {
            @Override
            public int calculate(int i, int j) {
                if (j == 0){
                    return 0;
                }
                return i / j;
            }
        }, BACKDIV {
            @Override
            public int calculate(int i, int j) {
                if (i == 0){
                    return 0;
                }
                return j / i;
            }
        };

        public abstract int calculate(int i, int j);
    }
}
