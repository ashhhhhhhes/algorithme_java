package com.ash.inflearn.recursive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveQ1Test {

    @Test
    public void test() {
        RecursiveQ1 T = new RecursiveQ1(3);

        assertEquals("1 2 3", T.printRecursive());
        assertEquals("1 2 3", T.printRecursive(3, ""));
    }

}