package com.ash.inflearn;

import com.ash.inflearn.string.InfQ10;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfQ10Test {

    @Test
    public void test() {

        InfQ10 T = new InfQ10();
        assertEquals("0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 2", T.solution("fkdgkjdflkgjljslgjkfldjlkfdg f"));
    }

}