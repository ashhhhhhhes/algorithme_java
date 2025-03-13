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
        String merge = "";

        if (root.lt != null) {
            merge += inorder(root.lt);
        }

        merge += root.toString();

        if (root.rt != null) {
            merge += inorder(root.rt);
        }

        return merge;
    }

    public String postorder(VNode root) {
        String merge = "";

        if (root.lt != null) {
            merge += postorder(root.lt);
        }

        if (root.rt != null) {
            merge += postorder(root.rt);
        }

        return merge += root.toString();
    }

}
