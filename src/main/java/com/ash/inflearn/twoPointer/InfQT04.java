package com.ash.inflearn.twoPointer;

/**
 * 4. 연속 부분수열
 */
public class InfQT04 {

    // N, M
    // 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}
    public int solution(int n, int m, int[] list) {
        int  result = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int k = i; k < n; k++) {
                sum += list[k];
                if (sum == m) {
                    result++;
                    break;
                } else if (sum > m) {
                    break;
                }
            }
        }

        return result;
    }

}
