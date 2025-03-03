package com.ash.inflearn.recursive;

public class RecursiveQ2 {

    public String solution(int n) {
        StringBuilder builder = new StringBuilder();
        return this.convertToBinary(n, builder)
                .toString()
                .trim();
    }

    public StringBuilder convertToBinary(int n, StringBuilder builder) {
        if (n == 0) return builder;
        return this.convertToBinary(n / 2, builder)
                .append(n % 2);
    }

}
