package com.ash.inflearn.recursive;

/**
 * 팩토리얼
 */
public class RecursiveQ3 {

    public int factorial(int n) {
        if (n == 1) return n;
        return n * this.factorial(n - 1);
    }
}
