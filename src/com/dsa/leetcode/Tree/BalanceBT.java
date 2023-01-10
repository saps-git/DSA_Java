package com.dsa.leetcode.Tree;

//Leetcode - 110

public class BalanceBT {
    public static boolean isBalanced(BinaryTree.TreeNode root) {
        return height(root) != -1;
    }

    public static int height(BinaryTree.TreeNode root) {
        if(root == null) return 0;

        int leftHeight = height(root.left);
        if(leftHeight == -1) return -1;
        int rightHeight = height(root.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight) > 1) return -1;

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
