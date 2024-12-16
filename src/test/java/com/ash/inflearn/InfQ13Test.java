package com.ash.inflearn;

import com.ash.inflearn.array.InfQ13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfQ13Test {

    @Test
    public void test() {
        InfQ13 infQ13 = new InfQ13();
        assertEquals("7 9 6 12", infQ13.solution(
                6,
                "7 3 9 5 6 12"
        ));
    }

}