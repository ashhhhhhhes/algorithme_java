package com.ash.inflearn.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StackQ5Test {

    @Test
    void solution() {

        StackQ5 T = new StackQ5();

        assertEquals(17, T.solution("()(((()())(())()))(())"));
        assertEquals(24, T.solution("(((()(()()))(())()))(()())"));
    }
}