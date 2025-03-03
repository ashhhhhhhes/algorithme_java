package com.ash.inflearn.recursive;

public class RecursiveQ4 {
    int[] arr = null;

    public int fibonacci(int n) {
        if (arr == null) arr = new int[n + 1];
        if (arr[n] > 0) return arr[n];
        if (n == 1) return arr[n] = 1;
        else if (n == 2) return arr[n] = 1;
        else return arr[n] = fibonacci(n - 2) + fibonacci(n - 1);
    }

    public String solution(int n) {
        this.fibonacci(n);
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            result.append(arr[i]).append(" ");
        }
        return result.toString().trim();
    }


}
