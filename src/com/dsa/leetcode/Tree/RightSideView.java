package com.dsa.leetcode.Tree;

//Leetcode-199

import java.util.*;

public class RightSideView {
    //Iterative - BFS
    public static List<Integer> rightSideView(BinaryTree.TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<BinaryTree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0;i<len;i++) {
                BinaryTree.TreeNode curr = queue.poll();
                if(i == 0) ans.add(curr.val);
                if(curr.right != null) queue.offer(curr.right);
                if(curr.left != null) queue.offer(curr.left);
            }
        }
        return ans;
    }

    //Recursive - DFS
//    public static List<Integer> rightSideView(BinaryTree.TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        int level = 0;
//        recursive(root, level, ans);
//        return ans;
//    }
//
//    public static void recursive(BinaryTree.TreeNode root, int level, List<Integer> ans) {
//        if(root == null) return;
//
//        if(level == ans.size()) ans.add(root.val);
//        recursive(root.right, level+1, ans);
//        recursive(root.left, level+1, ans);
//    }
}
