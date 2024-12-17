package com.ash.inflearn.array;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class InfQ18 {

    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String solution(int n, int[] nums) {
        String result = "";
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            int res = 0;
            while (temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }

            if (this.isPrime(res)) answer.add(res);
        }

        return answer.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }


}