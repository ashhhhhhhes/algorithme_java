package com.ash.inflearn.twoPointer;

/**
 * 5. 연속된 자연수의 합
 */
public class InfQT05 {

    public int solution(int n) {
        int pl = 0;
        int sum = 0;
        int result = 0;
        for (int pr = 0; pr < n; pr++) {
            sum += pr;
            if (sum == n) result++;
            else while (sum >= n) {
                sum -= pl++;
                if (sum == n) result++;
            }
        }

        return result;
    }

}
