package com.ash.inflearn;

public class InfQ16 {

    public String solution(int n) {
        int prev = 0;
        int curr = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(curr + " ");
            int temp = curr;
            curr += prev;
            prev = temp;
        }

        return sb.toString().trim();
    }

}
