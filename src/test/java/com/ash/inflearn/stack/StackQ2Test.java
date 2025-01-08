package com.ash.inflearn.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackQ2Test {

    @Test
    void test() {
        StackQ2 T = new StackQ2();

        assertEquals("EFLM", T.solution("(A(BC)D)EF(G(H)(IJ)K)LM(N)"));
    }

}