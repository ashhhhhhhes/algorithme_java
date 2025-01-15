package com.ash.inflearn.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SelectionSortTest {

    @Test
    void solution() {
        SelectionSort T = new SelectionSort();
        assertEquals("5 7 11 13 15 23", T.solution(new int[]{13, 5, 11, 7, 23, 15}));
    }
}