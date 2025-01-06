package com.ash.inflearn.hash;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 5. K번째 큰 수
 */
public class HashQ5 {

    public Integer solution(int n, int t, int[] a) {
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = a[i] + a[j] + a[k];
                    set.add(sum);
                }
            }
        }
        int cnt = 0;
        for (Integer i : set) {
            cnt++;
            if (cnt == t) return i;
        }

        return -1;
    }

}
