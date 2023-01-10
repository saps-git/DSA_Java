package com.dsa.leetcode.Tree;

//Leetcode-104

public class MaxDepth {
    public static int maxDepth(BinaryTree.TreeNode root) {
        if(root == null) return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight =  maxDepth(root.right);
        return 1 + Integer.max(leftHeight, rightHeight);
    }

}
