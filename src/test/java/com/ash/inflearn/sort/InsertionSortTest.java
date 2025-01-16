package com.ash.inflearn.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertionSortTest {

    @Test
    void test() {
        InsertionSort T = new InsertionSort();
        assertEquals("5 6 7 9 10 11", T.solution(new int[]{11, 7, 5, 6, 10, 9}));
        assertEquals("5 6 7 9 10 11", T.solution2(new int[]{11, 7, 5, 6, 10, 9}));

    }

}