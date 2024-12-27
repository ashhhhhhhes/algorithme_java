package com.ash.inflearn.twoPointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InfQT02Test {

    @Test
    void solution() {


        InfQT02 T = new InfQT02();

        assertEquals("2 3 5", T.solution(5, new int[]{1, 3, 9, 5, 2}, 5, new int[]{3, 2, 5, 7, 8}));
    }
}