package com.ash.programmers;

import java.util.Arrays;

public class PCCP02 {

    /**
     * @param diffs 현재 퍼즐 난이도
     * @param times 퍼즐의 소요 시간
     * @param limit 전체 제한시간
     * @return
     */
    public int solution(int[] diffs, int[] times, long limit) {
        int left = Arrays.stream(diffs).min().getAsInt(), right = Arrays.stream(diffs).max().getAsInt();
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (isCanCompleted(diffs, times, limit, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean isCanCompleted(int[] diffs, int[] times, long limit, int level) {
        long total = 0;
        int prevTime = 0;

        for (int i = 0; i < diffs.length; i++) {
            int diff = diffs[i], curTime = times[i];

            if (diff <= level) {
                total += times[i];
            } else {
                total += (long )(curTime+prevTime) * (diff - level)  + curTime;
            }

            prevTime = curTime;
        }

        return total <= limit;
    }

}
