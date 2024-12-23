package com.ash.inflearn.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfQArr12Test {

    @Test
    public void test() {
        InfQArr12 infQArr12 = new InfQArr12();

        int result = infQArr12.test("4 3\n" +
                "3 4 1 2\n" +
                "4 3 2 1\n" +
                "3 1 4 2\n");

        assertEquals(3, result);
    }

}