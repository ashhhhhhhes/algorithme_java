package com.ash.inflearn.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 1. 선택 정렬
 */
public class SelectionSort {

    public String solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (tmp > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    tmp = arr[i];
                }
            }
        }

        return Arrays.stream(arr).mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
    }

}
