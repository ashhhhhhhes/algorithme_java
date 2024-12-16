package com.ash.inflearn.string;

import java.util.Scanner;

public class Inf07 {

    public String solution(String text) {
        int length = text.length();
        text = text.toUpperCase();

        for (int i =0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                return "NO";
            }
        }

        return "YES";
    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Inf07 inf07 = new Inf07();
        System.out.println(inf07.solution(in.nextLine()));
        return ;
    }

}
