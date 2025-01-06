package com.ash.inflearn.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Hash - 4. 모든 아나그램 찾기
public class HashQ4 {

    public Integer solution(String S, String T) {

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (Character c : T.toCharArray()) {
            map.put(c, 0);
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < T.length() - 1; i++) {
            if (map.containsKey(S.charAt(i))) map.put(S.charAt(i), map.get(S.charAt(i)) + 1);
        }

        int pl = 0, result = 0;
        for (int i = T.length() - 1; i < S.length(); i++) {
            if (map.containsKey(S.charAt(i))) map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
            boolean flag = true;
            for (Character key : map.keySet()) {
                if (!Objects.equals(map.get(key), tMap.get(key))) {
                    flag = false;
                    break;
                }
            }
            if(flag) result++;
            if (map.containsKey(S.charAt(pl))) map.put(S.charAt(pl), map.get(S.charAt(pl)) - 1);
            pl++;
        }

        return result;
    }

    public Integer solution2(String S, String T) {

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (Character c : T.toCharArray()) {
            map.put(c, 0);
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < T.length() - 1; i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }

        int pl = 0, result = 0;
        for (int i = T.length() - 1; i < S.length(); i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
            if (tMap.equals(map)) result++;
            map.put(S.charAt(pl), map.get(S.charAt(pl)) - 1);
            if (map.get(S.charAt(pl)) == 0) map.remove(S.charAt(pl));
            pl++;
        }

        return result;
    }

}
