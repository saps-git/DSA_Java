package com.dsa.leetcode.Tree;

//Leetcode=103

import java.util.*;

public class ZigZagLevelOrder {
    public static List<List<Integer>> zigzagLevelOrder(BinaryTree.TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        Queue<BinaryTree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = true;
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++) {
                BinaryTree.TreeNode temp = queue.poll();
                if(leftToRight) level.add(temp.val);
                else level.add(0, temp.val);

                if(temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);
            }
            leftToRight = !leftToRight;
            ans.add(level);
        }

        return ans;
    }
}
