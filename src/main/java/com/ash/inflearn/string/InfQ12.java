package com.ash.inflearn.string;

public class InfQ12 {

    public String solution(int count, String text) {

        StringBuilder result = new StringBuilder();

        text = text
                .replaceAll("#", "1")
                .replaceAll("\\*", "0");

        for (int i = 0; i < count; i++) {
            int s = i * 7;
            String pass = text.substring(s, s + 7);
            result.append((char) Integer.parseInt(pass, 2));
        }

        return result.toString();
    }

}
