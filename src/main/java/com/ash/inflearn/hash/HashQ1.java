package com.ash.inflearn.hash;

import java.util.HashMap;

/**
 * 1. 학급 회장(해쉬)
 */
public class HashQ1 {

    public String solution(int n, String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        char result = ' ';
        for (char key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                result = key;
            }
        }

        return Character.toString(result);
    }

}
