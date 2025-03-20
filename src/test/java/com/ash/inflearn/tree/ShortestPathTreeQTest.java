package com.ash.inflearn.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortestPathTreeQTest {

    @Test
    public void test() {
        ShortestPathTreeQ T = new ShortestPathTreeQ();

        VNode root = new VNode(1);
        root.lt = new VNode(2);
        root.rt = new VNode(3);
        root.lt.lt = new VNode(4);
        root.lt.rt = new VNode(5);
        root.rt.lt = new VNode(6);
        root.rt.rt = new VNode(7);
        root.lt.lt.lt = new VNode(9);
        root.lt.lt.rt = new VNode(10);

        assertEquals(2, T.DFS(0, root));
        assertEquals(2, T.BFS(root));
    }

}