package com.ash.inflearn.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InfQ20Test {

    @Test
    public void test() {
        InfQ20 infQ20 = new InfQ20();
        List<Integer> arrayList = Arrays.asList(87 ,89 ,92, 100, 76);
        assertEquals("4 3 2 1 5" , infQ20.solution(arrayList));
    }

}