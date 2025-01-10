package com.ash.inflearn.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 7. 교육과정 설계
 */
public class QueueQ2 {

    public String solution(String r, String s) {
        Queue<Character> Q = new LinkedList<>();

        for (char c : r.toCharArray()) {
            Q.offer(c);
        }

        for (char c : s.toCharArray()) {
            if (Q.contains(c)) {
                if (Q.peek() == c) Q.poll();
                else return "NO";
            }
        }


        return !Q.isEmpty() ? "NO" : "YES";
    }

}