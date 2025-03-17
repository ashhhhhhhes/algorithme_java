package com.ash.inflearn.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSQ02 {

    int[] distnace = {1, -1, 5};

    /**
     * @param s 현수 위치
     * @param e 송아지 위치
     * @return 점프의 최소횟수 반환
     */
    public int solution(int s, int e) {
        int level = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int cur = queue.poll();
                if (cur != e) {
                    queue.add(cur + distnace[0]);
                    queue.add(cur + distnace[1]);
                    queue.add(cur + distnace[2]);
                } else {
                    return level;
                }
            }
            level++;
        }

        return level;
    }

}
