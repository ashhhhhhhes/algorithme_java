package com.ash.baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class Q2563 {

    // 도화지 : 100 x 100
    // 색종이 : 10 x 10
    // 입력:
    // 첫번쨰 : 색종이 수 (최대 100)
    //  두번쟤부터: ( 왼쪽변과 도화지 거리 , 아래쪽변과 도화지 거리 )
    // 색종이는 도화지 밖으로 가지 않는다.

    public  String solution(Scanner scanner) {

        int colorPapers = Integer.parseInt(scanner.nextLine());
        int[][] paper = new int[100][100];

        for (int i =0; i < colorPapers; i++) {
            String[] xy =  scanner.nextLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);

            // x  ~ x +1....
            // 100 - 10 ~ 100 - 1
            int bottom = 100 - y -1;

            for (int j = 0; j < 10; j++)  {
                int left  = x -1;
                for (int k = 0; k < 10; k++) {
                    paper[left++][bottom] = 1;
                }
                bottom--;
            }
        }

        int total = 0;
        for (int[] p : paper) {
            System.out.println(Arrays.toString(p));
            total += Arrays.stream(p).sum();
        }

        return total + "";
    }

}