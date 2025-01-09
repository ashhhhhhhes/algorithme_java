package com.ash.inflearn.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackQ4Test {

    @Test
    void solution() {
        StackQ4 T  = new StackQ4();
        assertEquals(12, T.solution("352+*9-"));
    }
}