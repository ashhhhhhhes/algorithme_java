package com.ash.inflearn.stack;

import com.ash.inflearn.queue.QueueQ1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueQ1Test {

    @Test
    public void  test() {
        QueueQ1 T = new QueueQ1();
        assertEquals(7, T.solution(8, 3));
    }

}