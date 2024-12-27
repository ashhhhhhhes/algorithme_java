package com.ash.inflearn.twoPointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InfQT03Test {

    @Test
    void solution() {

        InfQT03 infQT03 = new InfQT03();

        assertEquals(56, infQT03.solution(10, 3, new int[]{
                12, 15, 11, 20, 25, 10, 20, 19, 13, 15
        }));

    }
}