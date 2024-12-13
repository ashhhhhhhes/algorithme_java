package com.ash.inflearn;

public class InfQ11 {

    public String solution(String in) {

        int cnt = 1;
        in += " ";
        StringBuilder sb = new StringBuilder();

        for (int i =1; i < in.length(); i++) {
            if (in.charAt(i-1) == in.charAt(i)) {
                cnt++;
            } else {
                sb.append(in.charAt(i-1));
                if (cnt > 1) {
                    sb.append(cnt);
                    cnt =1;
                }
            }
        }

        return sb.toString();
    }

}
