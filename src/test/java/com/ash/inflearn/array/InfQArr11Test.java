package com.ash.inflearn.array;

import com.ash.utils.TestScanner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InfQArr11Test {


    @Test
    public void soultion() {
        String input = "5\n" +
                "2 3 1 7 3\n" +
                "4 1 9 6 8\n" +
                "5 5 2 4 4\n" +
                "6 5 2 6 7\n" +
                "8 4 2 2 2";

        TestScanner in = new TestScanner(input.split("\n"));
        int n = in.nextInt();

        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }


        InfQArr11 infQArr11 = new InfQArr11();
        assertEquals(4, infQArr11.solution(n, arr));
    }


}