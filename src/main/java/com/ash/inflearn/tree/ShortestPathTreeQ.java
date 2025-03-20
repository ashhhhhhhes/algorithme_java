package com.ash.inflearn.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathTreeQ {

    /**
     * 최단거리 DFS 로 풀어보기
     * (최단거리는 BFS로 풀어야하나, 연습으로 풀어보는 것)
     *
     * @param L
     * @param node
     * @return
     */
    public int DFS(int L, VNode node) {
        if (node.lt == null && node.rt == null) return L;
        else return Math.min(DFS(L + 1, node.lt), DFS(L + 1, node.rt));
    }


    /**
     * 최단거리 BFS로 풀어보기
     */
    public int BFS(VNode root) {
        Queue<VNode> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                VNode node = queue.poll();
                if (node.lt == null && node.rt == null) return L;
                if (node.lt != null) queue.add(node.lt);
                if (node.rt != null)  queue.add(node.rt);
            }
            L++;
        }
        return L;
    }

}
