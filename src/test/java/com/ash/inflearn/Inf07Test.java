package com.ash.inflearn;

import com.ash.inflearn.string.Inf07;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Inf07Test {

    @Test
    public void yes() {

        Inf07 solution = new Inf07();

        String result = solution.solution("gooG");

        assertEquals("YES", result);
    }

    @Test
    public void yes2() {

        Inf07 solution = new Inf07();

        String result = solution.solution("gofoG");

        assertEquals("YES", result);
    }

    @Test
    public void no() {

        Inf07 solution = new Inf07();

        String result = solution.solution("goofG");

        assertEquals("NO", result);
    }


}