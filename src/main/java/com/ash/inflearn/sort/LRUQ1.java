package com.ash.inflearn.sort;

import java.util.*;

/**
 * 4. Least Recently Used
 */
public class LRUQ1 {

    public String solution(int n, int m, int[] tasks) {
        int[] c = new int[n];

        for (int task  : tasks) {
            for (int i=n-1; i>0; i--) {
                if (c[i-1] != task)  c[i] = c[i-1]; //
                else {
                    for (int k=i; k<n-1; k++) {
                        c[k] = c[k+1];
                    }
                }
            }
            c[0] = task;
        }

        return Arrays.toString(c);
    }


}
