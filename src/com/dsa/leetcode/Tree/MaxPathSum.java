package com.dsa.leetcode.Tree;

//Leetcode-124

public class MaxPathSum {
    static int maxSum;
    public static int maxPathSum(BinaryTree.TreeNode root) {
        if(root == null) return 0;

        int leftHeight = Math.max(0, maxPathSum(root.left));
        int rightHeight = Math.max(0, maxPathSum(root.right));

        int curr =  root.val + leftHeight + rightHeight;
        maxSum = Math.max(maxSum, curr);
        return root.val + Math.max(leftHeight, rightHeight);
    }
}
