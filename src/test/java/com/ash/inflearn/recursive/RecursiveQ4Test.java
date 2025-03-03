package com.ash.inflearn.recursive;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursiveQ4Test {

    @Test
    void solution() {
        RecursiveQ4 T = new RecursiveQ4();
        assertEquals("1 1 2 3 5 8 13 21 34 55", T.solution(10));
    }
}