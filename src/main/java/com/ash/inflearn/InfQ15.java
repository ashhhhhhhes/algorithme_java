package com.ash.inflearn;

public class InfQ15 {


    public void solution(int n, int[] A, int[] B) {

        for (int i = 0; i < n; i++) {
            if (A[i] == B[i]) {
                System.out.println("D");
                continue;
            }

            switch (A[i]) {
                case 1:
                    if (B[i] == 2) {
                        System.out.println("B");
                    } else {
                        System.out.println("A");
                    }
                    continue;
                case 2:
                    if (B[i] == 3) {
                        System.out.println("B");
                    } else {
                        System.out.println("A");
                    }
                    continue;
                case 3:
                    if (B[i] == 1) {
                        System.out.println("B");
                    } else {
                        System.out.println("A");
                    }
            }
        }
    }

}
