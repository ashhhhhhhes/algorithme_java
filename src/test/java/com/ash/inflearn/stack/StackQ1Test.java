package com.ash.inflearn.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackQ1Test {

    @Test
    void solution() {
        StackQ1 stackQ1 = new StackQ1();
        assertEquals("NO", stackQ1.solution("(()()"));
    }
}