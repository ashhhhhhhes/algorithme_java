package com.ash.inflearn.tree;

public class VNode {
    int data;
    VNode lt,rt;

    public VNode(int val) {
        data=val;
        lt=rt=null;
    }

    @Override
    public String toString() {
        return data + "";
    }
}
