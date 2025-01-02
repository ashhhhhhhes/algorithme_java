package com.ash.inflearn.hash;

import java.util.HashMap;

/**
 * 1. 학급 회장(해쉬)
 */
public class HashQ1 {

    public String solution(int n, String str) {

        HashMap<String, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            String key = c + "";
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int max = 0;
        String result = "";
        for (String key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                result = key;
            }
        }

        return result;
    }

}
