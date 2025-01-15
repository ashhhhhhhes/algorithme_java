package com.ash.inflearn.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    @Test
    void solution() {
        BubbleSort T = new BubbleSort();
        assertEquals("5 7 11 13 15 23", T.solution(new int[]{13, 5, 11, 7, 23, 15}));
    }
}