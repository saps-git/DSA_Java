package com.dsa.tree;

public class MaxOfBT {
    public static int maxOfBT(BinaryTree.TreeNode root) {
        if(root == null) return Integer.MIN_VALUE;

        int result = root.data;
        int left = maxOfBT(root.left);
        int right = maxOfBT(root.right);

        if(left > result) result = left;
        if(right > result) result = right;

        return result;
    }
}
