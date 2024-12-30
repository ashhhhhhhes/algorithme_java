package com.ash.inflearn.twoPointer;

/**
 * 4. 연속 부분수열
 */
public class InfQT04 {

    // N, M
    // 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}
    public int solution(int n, int m, int[] list) {
            int result = 0;

            int lt = 0, rt = 0;
            int sum = list[0];

            while (lt < n && rt < n) {
                if (sum == m) {
                    result++;
                    sum -= list[lt++];
                } else if (sum > m) {
                    sum -= list[lt++];
                } else {
                    if (++rt >= n) break;
                    sum += list[rt];
                }
            }

        return result;
    }

}
