package com.ash.inflearn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfQ16Test {

    @Test
    public void test() {
        InfQ16 infQ16 = new InfQ16();

        assertEquals("1 1 2 3 5 8 13 21 34 55" , infQ16.solution(10));
    }
}