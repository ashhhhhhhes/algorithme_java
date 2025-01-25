package com.ash.utils;

import java.util.Arrays;

public class StringParseUtils {

    public static int[] stringToArray(String s) {

        return Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
