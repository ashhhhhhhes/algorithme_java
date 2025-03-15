package com.ash.inflearn.tree;

/**
 * 부분 집합 구하기
 */
public class DFSQ2 {
    int N;
    int[] ch;

    public void solution(int N) {
        ch = new int[N + 1];
        this.N = N;

        DFS(1);
    }

    public void DFS(int L) {
        if (L == N + 1) {
            String str = "";
            for (int i = 1; i < L; i++) {
                if (ch[i] == 1) str += i + " ";
            }
            System.out.println(str.trim());
        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }
}
