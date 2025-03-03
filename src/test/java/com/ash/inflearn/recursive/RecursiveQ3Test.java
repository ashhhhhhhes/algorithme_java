package com.ash.inflearn.recursive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveQ3Test {

    @Test
    public void test() {
        RecursiveQ3 T = new RecursiveQ3();
        assertEquals(120, T.factorial(5));
    }

}