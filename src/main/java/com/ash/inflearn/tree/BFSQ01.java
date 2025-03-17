package com.ash.inflearn.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 이진트리 순회 넓이우선탐색 레벨탐색
 */
public class BFSQ01 {

    public void solution() {
        VNode node = new VNode(1);

        node.lt = new VNode(2);
        node.rt = new VNode(3);
        node.lt.lt = new VNode(4);
        node.lt.rt = new VNode(5);
        node.rt.lt = new VNode(6);
        node.rt.rt = new VNode(7);
        BSF(node);
    }

    public void BSF(VNode root) {
        Queue<VNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            VNode node =  queue.poll();
            System.out.println(node);
            if (node.lt != null) queue.offer(node.lt);
            if (node.rt != null) queue.offer(node.rt);
        }
    }
}
