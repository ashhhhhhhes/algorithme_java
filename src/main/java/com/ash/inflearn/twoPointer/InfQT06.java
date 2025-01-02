package com.ash.inflearn.twoPointer;

/**
 * 6. 최대 길이 연속부분수열
 */
public class InfQT06 {

    public int solution(int n, int k, int[] arr) {
        int lp = 0, max = 0, chng = 0;

        for (int rp = 0; rp < n; rp++) {
            if (arr[rp] == 0) {
                chng++;
                while (chng > k) {
                        if (arr[lp++] == 0) {
                            chng--;
                        }
                }
            }

            max = Math.max(max, rp - lp + 1);
        }

        return max;
    }

}