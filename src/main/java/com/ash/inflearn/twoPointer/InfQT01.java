package com.ash.inflearn.twoPointer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1두배열 합치기
 */
public class InfQT01 {

    public String solution(int n, int[] nArr, int m, int[] mArr) {

        List<Integer> result = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while (result.size() < n + m) {
            if (p1 == n) {
                result.add(mArr[p2]);
                p2++;
                continue;
            }

            if (p2 == m) {
                result.add(nArr[p1]);
                p1++;
                continue;
            }

            if (nArr[p1] < mArr[p2]) {
                result.add(nArr[p1]);
                p1++;
            } else {
                result.add(mArr[p2]);
                p2++;
            }
        }

        return result.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }


}
