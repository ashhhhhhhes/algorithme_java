package com.ash.inflearn.stack;

import com.ash.utils.TestScanner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackQ3Test {

    @Test
    void solution() {
        StackQ3 T = new StackQ3();
        TestScanner sc = new TestScanner("5\n" +
                "0 0 0 0 0\n" +
                "0 0 1 0 3\n" +
                "0 2 5 0 1\n" +
                "4 2 4 4 2\n" +
                "3 5 1 3 1\n" +
                "8\n" +
                "1 5 3 5 1 2 1 4\n");

        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];

        for (int i=0; i<m; i++) {
            moves[i] = sc.nextInt();
        }

        assertEquals(4,T.solution(n, board, m, moves));
    }
}