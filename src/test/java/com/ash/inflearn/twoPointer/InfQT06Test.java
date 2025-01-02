package com.ash.inflearn.twoPointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InfQT06Test {

    @Test
    void solution() {
        String input = "1 0 0 0 0 1 0 0 0 1 0 1 1 0 0 0 0 0 1 1 0 1 0 0 0 1 0 1 0 1 0 0 0 0 0 1 1 1 0 0 0 0 0 0 1 0 1 1 0 1 1 1 0 1 1 1 0 0 0 1 1 1 1 0 1 1 0 0 1 0 1 1 0 1 1 0 0 1 0 0 1 1 1 1 1 1 1 1 0 1 0 1 0 1 1 0 1 0 0 1";
        String[] parts = input.split(" ");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        InfQT06 T = new InfQT06();
        int r = T.solution(100, 3, arr);
        assertEquals(15, r);
    }
}