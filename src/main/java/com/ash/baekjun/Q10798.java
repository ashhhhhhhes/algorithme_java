package com.ash.baekjun;

import com.ash.utils.TestScanner;

import java.util.ArrayList;
import java.util.List;

public class Q10798 {

    static String[] input = {
            "AABCDD",
            "afzz",
            "09121",
            "a8EWg6",
            "P5h3kx"
    };

    public static void main(String[] args) {
        TestScanner scanner = new TestScanner(input);
        String[] lines = new String[5];

        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            maxLength = Math.max(line.length(), maxLength);
            lines[i] = line;
        }

        String[] result = new String[maxLength];

        for (String line : lines) {
            char[] s = line.toCharArray();
            for (int j = 0; j < s.length; j++) {
                if (result[j] == null) result[j] = "";
                result[j] += s[j];
            }
        }

        System.out.printf(String.join("", result));
    }
}
