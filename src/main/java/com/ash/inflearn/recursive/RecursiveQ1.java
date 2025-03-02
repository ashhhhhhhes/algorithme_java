package com.ash.inflearn.recursive;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * 재귀함수
 * 1~N까지 출력.
 */
public class RecursiveQ1 {
    int n = 0;
    int v= 1;
    List<Integer> list = new ArrayList<>();

    public RecursiveQ1(int n) {
        this.n = n;
    }

    public String printRecursive() {
        if (this.n >= v) {
            list.add(v++);
            printRecursive();
        }

        return this.list.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }

}
