package com.dsa.leetcode.Tree;

//Leetcode-662 

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {
    static class Pair {
        BinaryTree.TreeNode node;
        int pos;
        Pair(BinaryTree.TreeNode node, int pos) {
            this.node = node;
            this.pos = pos;
        }
    }
    public static int widthOfBinaryTree(BinaryTree.TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        queue.offer(new Pair(root, 0));
        while(!queue.isEmpty()) {
            int size = queue.size();
            int lt = queue.peek().pos;
            int rt = queue.peek().pos;
            for(int i=0;i<size;i++) {
                Pair temp = queue.poll();
                rt = temp.pos;

                if(temp.node.left != null) queue.offer(new Pair(temp.node.left, 2*temp.pos+1));
                if(temp.node.right != null) queue.offer(new Pair(temp.node.right, 2*temp.pos+2));
            }
            max = Math.max(max, (rt-lt)+1);
        }
        return max;
    }
}
