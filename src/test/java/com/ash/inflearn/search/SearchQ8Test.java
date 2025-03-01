package com.ash.inflearn.search;

import com.ash.utils.TestScanner;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchQ8Test {

    @Test
    public void test() {
        TestScanner testScanner = new TestScanner("8 32\n" +
                "23 87 65 12 57 32 99 81\n");
        Scanner sc = testScanner.getScanner();
        int n = sc.nextInt();
        int t = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        SearchQ8 T = new SearchQ8();
        assertEquals(3, T.solution(n, t, arr));
    }

}