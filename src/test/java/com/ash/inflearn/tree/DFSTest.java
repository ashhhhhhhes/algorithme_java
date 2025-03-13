package com.ash.inflearn.tree;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DFSTest {

    VNode tree = new VNode(1);

    @BeforeEach
    void setUp() {
        tree.lt = new VNode(2);
        tree.rt = new VNode(3);
        tree.lt.lt = new VNode(4);
        tree.lt.rt = new VNode(5);
        tree.rt.lt = new VNode(6);
        tree.rt.rt = new VNode(7);
    }

    @Test
    void preorder() {
        DFS dfs = new DFS();
        assertEquals("1245367", dfs.preorder(tree));
    }

    @Test
    void inorder() {
        DFS dfs = new DFS();
        assertEquals("4251637", dfs.inorder(tree));
    }

    @Test
    void postorder() {
        DFS dfs = new DFS();
        assertEquals("4526731", dfs.postorder(tree));
    }
}