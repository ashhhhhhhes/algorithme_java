package com.ash.inflearn.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 2. 버블 정렬
 */
public class BubbleSort {

    public String solution(int[] arr) {

        int n = arr.length;
        while (n > 0) {
            for (int i=0; i<n-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int t = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = t;
                }
            }
            n--;
        }

        return Arrays.stream(arr).mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
    }
}
