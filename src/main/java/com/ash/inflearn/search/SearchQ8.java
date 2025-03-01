package com.ash.inflearn.search;

import java.util.Collections;
import java.util.List;

/**
 * Sorting and Searching 8. 이분검색
 */
public class SearchQ8 {

    public int solution(int n, int t, List<Integer> arr) {
        Collections.sort(arr);

        int low = 0, high = n - 1;

        for (int i = 0; i < arr.size(); i++) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < t) low = mid;
            else if (arr.get(mid) > t) high = mid;
            else return mid + 1;
        }

        return 0;
    }
}
