package com.ash.inflearn.array;

import java.util.ArrayList;

public class InfQ19 {

    public Integer solution(ArrayList<Integer> list) {

        int answer = 0;
        int acc = 0;
        for (Integer num : list) {
            if (num == 1) {
                acc += num;
                answer += acc;
            } else {
                acc = 0;
            }
        }

        return answer;
    }

}
