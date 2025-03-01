package com.ash.inflearn.search;

import java.util.Arrays;

/**
 * 9. 뮤직비디오(결정알고리즘)
 */
public class SearchQ9 {


    int solution(int m, int[] arr) {
        int left = Arrays.stream(arr).max().getAsInt();
        int right = Arrays.stream(arr).sum();

        int mid;
        int answer = 0;
        while (left <= right) {
            mid =(left + right) / 2;;
            int cnt = count(arr, mid);
            if (cnt <= m ) {
                answer = mid;
                right = mid -1;
            } else left = mid +1;
        }

        return answer;
    }

    int count(int[] arr, int capacity) {
        int cnt = 0;
        int sum = 0;

        for (int j : arr) {
            sum += j;
            if (capacity < sum) {
                cnt++;
                sum = j;
            }
        }

        if (sum <= capacity) cnt++;

        return cnt;
    }

}
