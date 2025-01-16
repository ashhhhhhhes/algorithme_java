package com.ash.inflearn.sort;

/**
 * 4. Least Recently Used
 */
public class LRUQ1 {

    public String solution(int n, int[] tasks) {
        int[] c = new int[n];

        for (int task : tasks) {
            for (int i = n - 1; i > 0; i--) {
                if (c[i - 1] != task) c[i] = c[i - 1]; //
                else {
                    for (int k = i; k < n - 1; k++) {
                        c[k] = c[k + 1];
                    }
                }
            }
            c[0] = task;
        }

        String answer = "";
        for (int ts : c) {
            answer += ts + " ";
        }

        return answer.trim();
    }

    public String solution2(int n, int[] tasks) {
        int[] c = new int[n];

        for (int task : tasks) {
            int pos = -1;
            for (int i = n - 1; i > 0; i--) if (task == c[i]) pos = i;
            if (pos == -1) {
                for (int i = n-1; i>0; i--) c[i] = c[i-1];
            } else {
                for (int i = pos; i>0; i--) c[i] = c[i-1];
            }
            c[0] = task;
        }

        String answer = "";
        for (int ts : c) {
            answer += ts + " ";
        }

        return answer.trim();
    }

}
