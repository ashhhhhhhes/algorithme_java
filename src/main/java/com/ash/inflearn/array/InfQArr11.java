package com.ash.inflearn.array;

public class InfQArr11 {

    public int solution(int n, int[][] arr) {

        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

}
