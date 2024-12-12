package com.ash.inflearn;

import java.util.Scanner;

public class InfQ8 {

    public String solution(String text) {

        text = text
                .toUpperCase()
                .replaceAll("[^A-Z]", "");


        String revers = new StringBuilder(text).reverse().toString();
        if (!revers.equals(text)) return  "NO";
        return "YES";
    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        InfQ8 T = new InfQ8();
        System.out.println(T.solution(in.nextLine()));
        return ;
    }
}
