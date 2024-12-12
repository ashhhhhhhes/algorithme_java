package com.ash.inflearn;

import java.util.Scanner;

public class InfQ8 {

    public String solution(String text) {

        text = text
                .replaceAll("[^a-zA-Z]", "")
                .toUpperCase();

        for (int i =0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return "NO";
            }
        }

        return "YES";
    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        InfQ8 T = new InfQ8();
        System.out.println(T.solution(in.nextLine()));
        return ;
    }
}
