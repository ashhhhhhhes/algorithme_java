package com.ash.inflearn.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 6. 공주 구하기
 */
public class QueueQ1 {

    public Integer solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int num = 1;
        while (queue.size() > 1) {
            if (num++ == k) {
                num = 1;
                queue.remove();
            } else {
                queue.add(queue.poll());
            }
        }

        return queue.poll();
    }
}
