package com.dsa.leetcode.Tree;

//Leetcode-102

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static List<List<Integer>> levelOrder(BinaryTree.TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<BinaryTree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int levelSize = queue.size(); //we take the queue size beforehand as
            //the queue size will change later on once we offer and poll from the queue
            //giving incorrect output.
            for(int i=0;i<levelSize;i++) {
                BinaryTree.TreeNode curr = queue.poll();
                level.add(curr.val);
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
            }
            ans.add(level);
        }
        return ans;
    }
}
