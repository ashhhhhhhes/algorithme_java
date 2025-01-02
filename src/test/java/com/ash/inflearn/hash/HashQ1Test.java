package com.ash.inflearn.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashQ1Test {

    @Test
    void solution() {
        HashQ1 T = new HashQ1();
        assertEquals("C" , T.solution(15, "BACBACCACCBDEDE"));
    }
}