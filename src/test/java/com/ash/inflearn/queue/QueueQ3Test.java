package com.ash.inflearn.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueQ3Test {

    @Test
    void solution() {
        QueueQ3 T = new QueueQ3();

        assertEquals(3, T.solution(2, new int[]{60, 50, 70, 80, 90}));
        assertEquals(4, T.solution(3, new int[]{70, 60, 90, 60, 60, 60}));
    }
}