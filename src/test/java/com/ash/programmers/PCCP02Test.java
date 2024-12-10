package com.ash.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PCCP02Test {

    @Test
    public void solution() {
        PCCP02 pccp02 = new PCCP02();

        // [1, 99999, 100000, 99995]	[9999, 9001, 9999, 9001]	3456789012	39354
        int result = pccp02.solution(
                new int[]{1, 99999, 100000, 99995},
                new int[]{9999, 9001, 9999, 9001},
                3456789012L
        );

        assertEquals(39354, result);
    }
}