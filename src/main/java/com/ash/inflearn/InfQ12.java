package com.ash.inflearn;

import java.util.Scanner;

public class InfQ12 {

    public String solution(int count, String text) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            // 0 - 6, 7 - 13
            int s = i * 7;
            String pass = text.substring(s, s + 7);
            int dd = 64;
            int asciiCode = 0;

            for (int j = 0; j < pass.length(); j++) {
                if (pass.charAt(j) == '#') {
                    asciiCode += dd;
                }

                dd = dd / 2;
            }

            result.append((char) asciiCode);
        }

        return result.toString();
    }

}
