package com.ash.inflearn.array;

import com.ash.utils.TestScanner;

public class InfQArr12 {

    // todo : https://cote.inflearn.com/contest/10/problem/02-12
    public int solution(int n, int m, int[][] arr) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                System.out.println("i : "  +  i + " | " + "j : "  +  j);
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        System.out.println("k : "  +  k+ " | " + "s : "  +  s  + " : v "  + arr[k][s]);
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }

                    if(pi<pj) cnt++;

                    System.out.println("pi : " + pi + " - " + "pj : " + pj + " - cnt : " + cnt);
                }

                if (cnt == m) answer++;
            }
        }

        return answer;
    }

    public int test(String str) {
        TestScanner in = new TestScanner(str);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        return solution(n, m, arr);
    }

}
