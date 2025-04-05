package com.ash.inflearn.tree;

import com.ash.utils.TestScanner;

/**
 * 경로 탐색 인접리스트
 */
public class Pathfinding01 {
    int[][] graph;
    int[] check;
    int n, m, cnt;

    public void D(int v) {
        if (v == n) cnt++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && check [i] == 0) {
                    check[i] = 1;
                    D(i);
                    check[i] = 0;
                }
            }
        }
    }

    /**
     * @param n 정점의 개수
     * @param m 간선의 개수
     */
    public int solution(String str) {
        TestScanner in = new TestScanner(str);
        this.n = in.nextInt();
        this.m = in.nextInt();

        this.graph = new int[n + 1][n + 1];
        this.check = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            this.graph[a][b] = 1;
        }

        check[1] = 1;
        D(1);

        return this.cnt;
    }

}
