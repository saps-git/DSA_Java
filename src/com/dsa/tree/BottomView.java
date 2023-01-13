package com.dsa.tree;

import java.util.*;


public class BottomView {
    public static List<Integer> bottomView(BinaryTree.TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0, root));

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            map.put(curr.line, curr.node.data);

            if(curr.node.left != null) queue.offer(new Pair(curr.line-1, curr.node.left));
            if(curr.node.right != null) queue.offer(new Pair(curr.line+1, curr.node.right));
        }
        ans.addAll(map.values());

        return ans;
    }
}
