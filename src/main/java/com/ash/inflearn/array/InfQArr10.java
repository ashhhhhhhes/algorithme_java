package com.ash.inflearn.array;

/**
 * 배열 - 10. 봉우리
 */
public class InfQArr10 {

    public int solution(int n, int[][] grid) {

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                int top = k == 0 ? 0 : grid[i][k - 1];
                int bottom = k == n - 1 ? 0 : grid[i][k + 1];
                int left = i == 0 ? 0 : grid[i - 1][k];
                int right = i == n - 1 ? 0 : grid[i + 1][k];
                if (grid[i][k] > top && grid[i][k] > bottom && grid[i][k] > left && grid[i][k] > right) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

}
