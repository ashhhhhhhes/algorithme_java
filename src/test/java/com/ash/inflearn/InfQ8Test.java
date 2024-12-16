package com.ash.inflearn;

import com.ash.inflearn.string.InfQ8;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfQ8Test {

    @Test
    public void yes() {

        InfQ8 solution = new InfQ8();

        String result = solution.solution("found7, time: study; Yduts; emit, 7Dnuof");

        assertEquals("YES", result);
    }

    @Test
    public void yes2() {

        InfQ8 solution = new InfQ8();

        String result = solution.solution("found7, time: study T; Yduts; emit, 7Dnuof");

        assertEquals("YES", result);
    }

    @Test
    public void no() {

        InfQ8 solution = new InfQ8();

        String result = solution.solution("found7, time: study; Yduts; emit, d27Dnuof");

        assertEquals("NO", result);
    }
}