package com.ash.inflearn.twoPointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InfQT04Test {

    @Test
    public void test() {
        InfQT04 infQT04 = new InfQT04();

        assertEquals(3, infQT04.correctAnswer(8, 6, new int[]{
                1, 2, 1, 3, 1, 1, 1, 2
        }));
    }

}