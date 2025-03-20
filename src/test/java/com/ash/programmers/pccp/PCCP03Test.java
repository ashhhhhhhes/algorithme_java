package com.ash.programmers.pccp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PCCP03Test {


    @Test
    void solution() {
        PCCP03 T = new PCCP03();
        Assertions.assertEquals(1, T.solution(new int[][]{new int[]{3, 2}, new int[]{6, 4}, new int[]{4, 7}, new int[]{1, 4}}, new int[][]{new int[]{4, 2}, new int[]{1, 3}, new int[]{2, 4}}));
    }

    @Test
    void testMove() {
        PCCP03 T = new PCCP03();
    }


    @Test
    void test2() {
        PCCP03 T = new PCCP03();

        Assertions.assertEquals(9, T.solution(new int[][]{new int[]{3, 2}, new int[]{6, 4}, new int[]{4, 7}, new int[]{1, 4}}, new int[][]{new int[]{4, 2}, new int[]{1, 3}, new int[]{4, 2}, new int[]{4, 3}}));
        // [[2, 3, 4, 5], [1, 3, 4, 5]]
        Assertions.assertEquals(0, T.solution(new int[][]{new int[]{2, 2}, new int[]{2, 3}, new int[]{2, 7}, new int[]{6, 6}, new int[]{5, 2}},
                new int[][]{new int[]{2, 3}, new int[]{4, 5}}));
    }

    @Test
    void test3() {
        PCCP03 T = new PCCP03();
        Assertions.assertEquals(0, T.solution(
                new int[][]{new int[]{2, 2}, new int[]{2, 3}, new int[]{2, 7}, new int[]{6, 6}, new int[]{5, 2}},
                new int[][]{new int[]{2, 3, 4, 5}, new int[]{1, 3, 4, 5}}));
    }
}