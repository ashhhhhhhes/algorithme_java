package com.ash.inflearn.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HashQ2Test {

    @Test
    void solution() {
        HashQ2 T = new HashQ2();
        assertEquals("YES", T.solution2("AbaAeCe", "baeeACA"));
        assertEquals("NO", T.solution2("abaCC", "Caaab"));
    }
}