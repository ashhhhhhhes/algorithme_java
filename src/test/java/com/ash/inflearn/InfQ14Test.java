package com.ash.inflearn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfQ14Test {

    @Test
    public void test() {
        InfQ14 infQ14 = new InfQ14();
        String result = infQ14.solution(8, new int[]{130, 135, 148, 140, 145, 150, 150, 153});
        assertEquals("5", result);
    }

}