package com.ash.inflearn.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashQ5Test {

    @Test
    void solution() {
        HashQ5 T = new HashQ5();
        assertEquals(143, T.solution(10, 3,
                new int[]{13, 15, 34, 23, 45, 65, 33, 11, 26, 42}));
    }
}