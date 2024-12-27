package com.ash.inflearn.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 공통 원소 구하기
 */
public class InfQT02 {

    public String solution(int n, int[] nArr, int m, int[] mArr) {
        List<Integer> r = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        Arrays.sort(nArr);
        Arrays.sort(mArr);

        while (p1 < n && p2 < m) {
            if (nArr[p1] == mArr[p2]) {
                r.add(nArr[p1]);
                p1++;
                p2++;
            } else if (nArr[p1] < mArr[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return r.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }

}
