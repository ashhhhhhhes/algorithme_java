package com.ash.inflearn.recursive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveQ2Test {

    @Test
    public void test() {
        RecursiveQ2 T =new RecursiveQ2();
        assertEquals("1011", T.solution(11));
    }
}