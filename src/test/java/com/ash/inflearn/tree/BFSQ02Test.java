package com.ash.inflearn.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BFSQ02Test {

    @Test
    public void case1() {
        BFSQ02 T = new BFSQ02();
        assertEquals(3, T.solution(5, 14));
    }

    @Test
    public void case2() {
        BFSQ02 T = new BFSQ02();
        assertEquals(5, T.solution(8, 3));
    }

}