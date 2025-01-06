package com.ash.inflearn.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 3. 매출액의 종류
 */
public class HashQ3 {

    public String solution(int n, int k, int[] arr) {
        List<String> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        result.add(map.size() + "");

        int pl = 0;
        for (int pr = k; pr < n; pr++) {
            if (map.get(arr[pl]) <= 1) map.remove(arr[pl]);
            else map.put(arr[pl], map.getOrDefault(arr[pl], 0) - 1);

            pl++;
            map.put(arr[pr], map.getOrDefault(arr[pr], 0) + 1);
            result.add(map.size() + "");
        }

        return String.join(" ", result);
    }

}
