package com.ash.inflearn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfQ12Test {

    @Test
    public void test() {
        InfQ12 infQ12 = new InfQ12();
         assertEquals("COOL", infQ12.solution(4, "#****###**#####**#####**##**"));
    }

}