package com.ash.inflearn.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InfQ20 {

    public String solution(List<Integer> list) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            int count = 1;
            for (int k = 0; k < list.size(); k++) {
                if (i != k && list.get(k) > num) {
                    count++;
                }
            }

            answer.add(i, count);
        }

        return answer.stream().map(String::valueOf).collect(Collectors.joining(" "));

    }

}
