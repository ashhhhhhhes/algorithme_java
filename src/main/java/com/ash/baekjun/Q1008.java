package com.ash.baekjun;

import java.util.Scanner;

public class Q1008 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] line = sc.nextLine().split(" ");
        Double d = Double.parseDouble(line[0]) / Double.parseDouble(line[1]);
        System.out.print(d);
    }

}
