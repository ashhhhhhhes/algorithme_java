package com.ash.inflearn;

import com.ash.inflearn.array.InfQ17;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class InfQ17Test {

    @Test
    public void test() {
        InfQ17 infQ17 = new InfQ17();
        assertEquals(8, infQ17.solution(20));
    }

}