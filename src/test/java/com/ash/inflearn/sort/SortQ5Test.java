package com.ash.inflearn.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortQ5Test {

    @Test
    void test() {
        SortQ5 T = new SortQ5();
        assertEquals("U", T.solution(10,
                new int[]{
                        58, 50, 36, 11, 10, 95, 48, 51, 54, 62
                }));


//        assertEquals("D", T.solution(8, new int[]{
//                20, 25, 52, 30, 39, 33, 43, 33
//        }));
//
//        assertEquals("D", T.solution(7, new int[]{
//                20, 25, 52, 30, 39, 33, 43
//        }));

    }

}