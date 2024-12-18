package com.ash.inflearn.array;

/**
 * 9. 격자판 최대합
 */
public class InfQArr09 {

    public String solution(int n, int[][] box) {

        int max = 0;
        int dia1 = 0;
        int dia2 = 0;
        for (int i = 0; i < n; i++) {
            int colum = 0;
            int row = 0;
            dia1 += box[i][i];
            dia2 += box[i][n - i - 1];
            for (int k = 0; k < n; k++) {
                colum += box[i][k];
                row += box[k][i];
            }

            if (Math.max(row, colum) > max) max = Math.max(row, colum);
        }

        return Math.max(Math.max(dia1, dia2), max) + "";
    }

}