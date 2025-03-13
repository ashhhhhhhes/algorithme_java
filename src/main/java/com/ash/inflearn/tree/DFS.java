package com.ash.inflearn.tree;

public class DFS {

    public String preorder(VNode root) {
        String merge = root.toString();

        if (root.lt != null) {
            merge += preorder(root.lt);
        }

        if (root.rt != null) {
            merge += preorder(root.rt);
        }

        return merge;
    }

    public String inorder(VNode root) {
        return "";
    }

    public String postorder(VNode root) {
        return "";
    }

}
