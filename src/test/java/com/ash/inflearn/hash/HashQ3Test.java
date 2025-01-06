package com.ash.inflearn.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HashQ3Test {

    @Test
    void solution() {
        HashQ3 T = new HashQ3();

        Assertions.assertEquals("3 4 4 3", T.solution(7, 4, new int[]{20, 12, 20, 10, 23, 17, 10}));
    }
}