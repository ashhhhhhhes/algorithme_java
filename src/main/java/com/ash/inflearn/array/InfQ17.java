package com.ash.inflearn.array;

public class InfQ17 {

    public int solution(int n) {

        int[] arr = new int[n];

        for (int i = 1; i <= n; i++) {
            arr[i-1] = i;
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] != 0) {
                int num = arr[i];
                for (int r = 1; r < n / num; r++) {
                        arr[i + num * r]  = 0;
                }
            }
        }

        int cnt = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] != 0) {
                cnt++;
            }
        }

        return cnt;
    }


}
