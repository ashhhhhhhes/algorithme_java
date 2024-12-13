package com.ash.inflearn;

public class InfQ13 {

    public String solution(int n, String d) {

        d += " -1";
        String[] nums = d.split(" ");

        StringBuilder result = new StringBuilder();
        result.append(nums[0]);

        for (int i = 1; i < n + 1; i++) {
            if (Integer.parseInt(nums[i]) > Integer.parseInt(nums[i - 1])) {
                result.append(" ")
                        .append(nums[i]);
            }
        }

        return result.toString();
    }
}
