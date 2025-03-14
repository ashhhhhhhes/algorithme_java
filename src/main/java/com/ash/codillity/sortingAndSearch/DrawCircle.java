package com.ash.codillity.sortingAndSearch;


import java.util.Arrays;

/**
 * TODO 다시 풀어보기
 * NumberOfDiscIntersections
 */
public class DrawCircle {

    public int solution(int[] A) {

        long[] leftBound = new long[A.length];
        long[] rightBound = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            leftBound[i] = i - A[i];
            rightBound[i] = i + A[i];
        }

        Arrays.sort(leftBound);
        Arrays.sort(rightBound);

        int count = 0;
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            while (j < A.length && leftBound[j] <= rightBound[i]) {
                j++;
            }
            count += j - i - 1;

            if (10_000_000 < count) return -1;
        }

        return count;
    }
}
