package com.ash.inflearn.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pathfinding01Test {

    @Test
    public void test() {
        Pathfinding01 T = new Pathfinding01();

        assertEquals(6,T.solution("5 9\n" +
                "1 2\n" +
                "1 3\n" +
                "1 4\n" +
                "2 1\n" +
                "2 3\n" +
                "2 5\n" +
                "3 4\n" +
                "4 2\n" +
                "4 5"));
    }

}