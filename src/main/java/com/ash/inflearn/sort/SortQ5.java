package com.ash.inflearn.sort;

/**
 * 5. 중복 확인
 */
public class SortQ5 {

    public String solution(int n, int[] arr) {
        String result = "U";

        for (int i = 0; i < n - 1; i++) {
            if (result.equals("D")) break;

            for (int k = i + 1; k < n; k++) {
                if (arr[k - 1] < arr[k]) {
                    int t = arr[k - 1];
                    arr[k - 1] = arr[k];
                    arr[k] = t;
                } else if (arr[k - 1] == arr[k]) {
                    result = "D";
                    break;
                }
            }
        }

        return result;
    }

}
