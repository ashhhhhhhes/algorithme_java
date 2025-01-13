package com.ash.inflearn.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueQ3 {

    public int solution(int m, int[] arr) {

        Queue<Person> queue = new LinkedList<>();

        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Person p = queue.poll();

            for (Person n : queue) {
                if (p.priority < n.priority) {
                    queue.offer(p);
                    p = null;
                    break;
                }
            }

            if (p != null) {
                answer++;
                if (p.idx == m) return answer;
            }
        }

        return answer;
    }

    public static class Person {
        int idx;
        int priority;

        public Person(int idx, int value) {
            this.idx = idx;
            this.priority = value;
        }
    }
}
