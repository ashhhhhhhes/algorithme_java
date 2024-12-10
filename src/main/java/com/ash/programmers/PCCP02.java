package com.ash.programmers;

public class PCCP02 {

    /**
     * @param diffs 현재 퍼즐 난이도
     * @param times 퍼즐의 소요 시간
     * @param limit 전체 제한시간
     * @return
     */
    public int solution(int[] diffs, int[] times, long limit) {
        int length = diffs.length;
        int level = 1;

        // 최솟값...
        while (true) {
            long solvedTime = 0;

            for (int i = 0; i < length; i++) {
                int diff = diffs[i];
                int time_curr = times[i];
                int time_prev = i != 0 ? times[i - 1] : 0;

                if (diff <= level) {
                    solvedTime += time_curr;
                } else {
                    solvedTime += time_curr + (long) (time_curr + time_prev) * (diff - level);
                }
            }

            if (solvedTime <= limit) {
                break;
            }

            level++;
        }

        return level;
    }

}
