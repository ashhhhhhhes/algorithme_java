package com.ash.inflearn.twoPointer;

/**
 * 3. 최대 매출
 */
public class InfQT03 {

    public int solution(int n, int m, int[] arr) {
        int max = 0;

        for (int i = 0; i < m; i++) {
            max += arr[i];
        }

        int sum = max;

        for (int i = m; i < n - 1; i++) {
            sum += arr[i];
            sum -= arr[i - m];
            max = Math.max(sum,max);
        }

        return max;
    }
}
