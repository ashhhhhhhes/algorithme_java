package com.ash.inflearn.twoPointer;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class InfQT01Test {

    @Test
    public void test() {
        InfQT01 T = new InfQT01();

        String result =  T.solution(3, new int[]{1, 3, 5}, 5, new int[]{2, 3, 6, 7, 9});

        assertEquals("1 2 3 3 5 6 7 9", result);
    }

}