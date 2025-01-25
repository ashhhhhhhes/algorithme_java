package com.ash.inflearn.sort;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 6. 장난꾸러기
 */
public class SortQ6 {

    public String solution(int[] arr) {
        int max = -1, min = arr.length;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int k=i+1; k<arr.length; k++) {
                if (arr[i] > arr[k]) {
                    max = i  + 1;
                    break;
                }
            }

            if (max != -1) {
                break;
            }
        }

        for (int i = arr.length - 1; i > max; i--) {
            if (arr[i] < arr[i - 1]) {
                min = i + 1;
                break;
            }
        }

        return max + " " + min;
    }

    public String solution2(int[] arr) {
        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        String answer = "";
        for (int i =0; i<arr.length; i++) {
            if (arr[i] != tmp[i]) {
                answer += (i + 1) + " ";
            }
        }

        return answer.trim();
    }
}
