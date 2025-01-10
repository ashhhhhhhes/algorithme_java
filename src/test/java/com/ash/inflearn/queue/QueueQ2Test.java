package com.ash.inflearn.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueQ2Test {
    @Test
    public  void  test() {
        QueueQ2  T = new QueueQ2();
        assertEquals("YES", T.solution("CBA", "CBDAGE"));
        assertEquals("NO", T.solution("AKDEF", "AYKGDHEJ"));
        assertEquals("NO", T.solution("CBA", "CDAGBE"));
    }

}