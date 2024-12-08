package com.ash.baekjun;

import com.ash.utils.TestScanner;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q2566 {
    static String[] input = {
            "3 23 85 34 17 74 25 52 65",
            "10 7 39 42 88 52 14 72 63",
            "87 42 18 78 3 45 18 84 34",
            "34 28 64 85 12 16 75 36 55",
            "21 77 45 35 28 75 2 76 1",
            "25 87 65 15 28 11 37 90 74",
            "65 27 75 41 7 89 78 64 39",
            "47 47 70 45 23 65 3 41 44",
            "2 90 82 38 31 12 29 29 2"
    };

    public static void main(String[] args) {
        TestScanner scanner = new TestScanner(input);
        int max = 0;
        int[] pos = new int[]{-1, -1};

        for (int i = 0; i < 9; i++) {
            String line = scanner.nextLine();
            List<Integer> nums = Arrays.stream(line.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            for (int j = 0; j < nums.size(); j++) {
                int num = nums.get(j);
                if (max <= num) {
                    pos[0] = i;
                    pos[1] = j;
                    max = num;
                }
            }
        }

        scanner.close();

        System.out.println(max + "");
        System.out.printf((pos[0] + 1) + " " + (pos[1] + 1));
    }


}
