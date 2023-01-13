package com.dsa.leetcode.Tree;

//Leetcode-987

import java.util.*;

class Pair {
    int y;
    int x;
    BinaryTree.TreeNode node;

    Pair(int y, int x, BinaryTree.TreeNode node) {
        this.y = y;
        this.x = x;
        this.node = node;
    }
}
public class VerticalOrder {
    public static List<List<Integer>> verticalTraversal(BinaryTree.TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0, 0, root));

        while(!queue.isEmpty()) {
            Pair curr = queue.poll();
            if(!map.containsKey(curr.y)) {
                map.put(curr.y, new TreeMap<>());
            }
            if(!map.get(curr.y).containsKey(curr.x)) {
                map.get(curr.y).put(curr.x, new PriorityQueue<>());
            }
            map.get(curr.y).get(curr.x).offer(curr.node.val);

            if(curr.node.left != null) queue.offer(new Pair(curr.y-1, curr.x+1, curr.node.left));
            if(curr.node.right != null) queue.offer(new Pair(curr.y+1, curr.x+1, curr.node.right));
        }

        for(TreeMap<Integer, PriorityQueue<Integer>> mp: map.values()) {
           List<Integer> level = new ArrayList<>();
           for(PriorityQueue<Integer> pq: mp.values()) {
               while(!pq.isEmpty()) level.add(pq.poll());
           }
           ans.add(level);
        }
        return ans;
    }
}
