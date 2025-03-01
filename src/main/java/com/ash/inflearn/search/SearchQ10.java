package com.ash.inflearn.search;

import java.util.Arrays;

/**
 * 10. 마구간 정하기(결정알고리즘)
 */
public class SearchQ10 {

    public int solution(int n, int c, int[] x) {
        Arrays.sort(x);
        int left = 1;
        int right = x[x.length-1];

        int answer = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (count(x, mid) >= c) { //
                answer = mid;
                left = mid + 1;
            } else right = mid - 1;
        }

        return answer;
    }

    private int count(int[] x, int distance) {
        int count = 1;
        int ep = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] - ep  >= distance) {
                count++;
                ep = x[i];
            }
        }

        return count;
    }

}
