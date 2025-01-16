package com.ash.inflearn.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUQ1Test {

    @Test
    void solution() {
        LRUQ1 T = new LRUQ1();

        // 1 2 3 2 6 2 3 5 7
        assertEquals("7 5 3 2 6", T.solution(5, new int[]{1, 2, 3, 2, 6, 2, 3, 5, 7}));
        assertEquals("7 5 3 2 6", T.solution2(5, new int[]{1, 2, 3, 2, 6, 2, 3, 5, 7}));
    }
}