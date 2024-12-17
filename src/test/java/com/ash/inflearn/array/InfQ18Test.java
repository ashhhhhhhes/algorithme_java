package com.ash.inflearn.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InfQ18Test {

    @Test
    public void test() {
        InfQ18 infQ18 = new InfQ18();

        int n = 27;
        int[] nums = new int[]{
                469, 84, 8851, 189, 69, 1210, 682, 57, 6217, 484, 8, 3590, 662, 36, 8275, 887, 17, 1254, 462, 67, 8969, 141, 70, 5603, 958, 100, 3843
        };

        assertEquals("953 71 7 859", infQ18.solution(n, nums));

    }

}