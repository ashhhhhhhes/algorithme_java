package com.ash.baekjun;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q2738 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> size = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int n = size.get(0); // row
        int m = size.get(1); // column

        int[][] result = new int[n][m];

        int cnt = 0; // 0,1,2,3,4,5

        while (scanner.hasNext()) {
            int nIdx = cnt++ % n;
            String line = scanner.nextLine();
            List<Integer> nums = Arrays.stream(line.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            for (int i = 0; i < m; i++) {
                result[nIdx][i] += nums.get(i);
            }
        }

        scanner.close();

        for (int[] ints : result) {
            StringBuilder t = new StringBuilder();
            for (int anInt : ints) {
                t.append(anInt).append(" ");
            }
            System.out.println(t);
        }
    }
}
