package com.ash.inflearn;

import java.util.Arrays;

public class InfQ16 {

    public String solution(int n) {
        int prev = 0;
        int curr = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(curr + " ");
            int temp = curr;
            curr += prev;
            prev = temp;
        }

        return sb.toString().trim();
    }

    public int[] solutionArray(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr;
    }

}
