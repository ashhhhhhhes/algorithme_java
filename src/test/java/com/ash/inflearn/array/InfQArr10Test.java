package com.ash.inflearn.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InfQArr10Test {

    @Test
    void solution() {
        InfQArr10 infQArr10 = new InfQArr10();

        int n = 5;
        int[][] grid = new int[][]{
                new int[] {5, 3, 7, 2, 3},
                new int[] {3, 7, 1, 6, 1},
                new int[] {7 ,2 ,5 ,3 ,4},
                new int[] {4, 3, 6, 4, 1},
                new int[] {8 ,7, 3 ,5, 2}
        };

        Assertions.assertEquals(10, infQArr10.answer(n, grid));
    }
}