package com.ash.inflearn.array;

public class InfQ14 {

    public String solution(int N, int[] K) {
        int count = 1;
        int temp = K[0];
        for (int i = 1; i < N; i++) {
            if (K[i] > temp) {
                count += 1;
                temp = K[i];
            }
        }

        return count + "";
    }


}