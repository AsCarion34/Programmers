package exhaustive_search.solution02;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution {
    /***
     * @분석
     * numbers 를 한자리 숫자로 모두 분리 후,
     * 조합하여 만들 수 있는 소수의 갯수를 카운트 한다.
     * 소수 : 1과 자신 이외의 수로는 나눌 수 없는 수.
     * 판별 방식 : 2 <= x < 자신 중 x로 나눈 나머지가 한번이라도 없는 경우 소수가 아니다.
     * 1, 7 의 경우, 1, 7, 17, 71 중 7, 17, 71 3개가 소수
     *
     * @param numbers
     * @return int : numbers 의 숫자 조합으로 만들 수 있는 소수의 갯수
     */
    public int solution(String numbers) {
        int answer = 0;

        // numbers 를 하나씩 숫자로 분리한다.
        int[] nums = new int[numbers.length()];
        for(int i =0; i < numbers.length(); i++) {
            nums[i] = Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }

        // 숫자들로 만들수 있는 모든 경우의 수를 구한다.
        Set<Integer> numList = new LinkedHashSet<>();
        for(int i = 1; i <= nums.length; i++) {
            perm(nums, 0, i, numList);
        }

        // 소수인지 판별하여 갯수를 센다.
        for(int num : numList) {
            if(num > 1 && isPrime(num)) {   // 1은 소수에서 제외하여야 한다.
                System.out.println(String.format("numList number : %d is prime number", num));
                answer += 1;
            } else {
                System.out.println(String.format("numList number : %d", num));
            }
        }

        return answer;
    }

    // 재귀 순열로 처리.
    private void perm(int[] arr, int depth, int n, Set numList) {
        if(depth == n) {
            // 최종 깊이에 도달하였으므로 numList 에 변환하여 넣고 탈출한다.
            numList.add(convertArrayToInt(arr, n));
            return;
        }

        for(int i = depth; i < arr.length; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n, numList);
            swap(arr, i, depth);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // 주어진 크기 만큼 한자리씩 올리면서 더하는 방식.
    private int convertArrayToInt(int[] arr, int size) {
        int result = 0;
        for(int i = 0; i < size; i++) {
            result *= 10;
            result += arr[i];
        }
        return result;
    }

    private boolean isPrime(int num) {
//        return IntStream.iterate(2, i -> i++).limit((int)Math.sqrt(num))    // 에라토스테네스의 체 이용.
//                .noneMatch(i -> num % i == 0);
        boolean bPrime = true;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                bPrime = false;
                break;
            }
        }
        return bPrime;
    }
}
