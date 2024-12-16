package com.ash.inflearn.string;

import java.util.Scanner;

public class InfQ10 {

    public String solution(String in) {
        String[] a = in.split(" ");
        String s = a[0];
        String t = a[1];

        int[] num = new int[s.length()];
        int p = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(0)) {
                p = 0;
            } else {
                p += 1;
            }

            num[i] = p;
        }

        p = 1000;

        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) == t.charAt(0)) {
                p = 0;
            } else {
                p += 1;
            }

            num[i] = Math.min(p, num[i] % 1000);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(num[i]);
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        InfQ10 T = new InfQ10();
        System.out.println(T.solution(in.nextLine()));
        return ;
    }
}
