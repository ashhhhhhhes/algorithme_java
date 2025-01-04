package com.ash.inflearn.hash;

import java.util.HashMap;
import java.util.Objects;

/**
 * 2. 아나그램(해쉬)
 */
public class HashQ2 {

    public String solution(String a, String b) {
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0) + 1);
            bMap.put(b.charAt(i), bMap.getOrDefault(b.charAt(i), 0) + 1);
        }

        if (aMap.size() != bMap.size()) return "NO";

        for (Character c : aMap.keySet()) {
            if (!Objects.equals(aMap.get(c), bMap.get(c))) {
                return "NO";
            }
        }

        return "YES";
    }

    public String solution2(String a, String b) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : b.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return "NO";
            map.put(c, map.get(c) - 1);
        }

        return "YES";
    }
}
