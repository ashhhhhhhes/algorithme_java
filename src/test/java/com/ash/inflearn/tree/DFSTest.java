package com.ash.inflearn.tree;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DFSTest {

    @Test
    void preorder() {
        VNode tree = new VNode(1);
        tree.lt = new VNode(2);
        tree.rt = new VNode(3);
        tree.lt.lt = new VNode(4);
        tree.lt.rt = new VNode(5);
        tree.rt.lt = new VNode(6);
        tree.rt.rt = new VNode(7);

        DFS dfs = new DFS();
        assertEquals("1245367", dfs.preorder(tree));
    }
}