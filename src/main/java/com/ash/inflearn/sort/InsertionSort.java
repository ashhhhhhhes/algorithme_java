package com.ash.inflearn.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 3. 삽입 정렬
 */
public class InsertionSort {

    public String solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int k = 0; k < i; k++) {
                if (arr[i] < arr[k]) {
                    int t = arr[i];
                    arr[i] = arr[k];
                    arr[k] = t;
                }
            }
        }

        return Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(" "));
    }

    public String solution2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int t = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (t < arr[j]) {
                    arr[j + 1] = arr[j];
                } else break;
            }

            arr[j+1] = t;
        }

        return Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(" "));
    }

}
