package com.dsa.leetcode.Tree.BST;

//Leetcode-98

public class ValidateBT {
    public static boolean isValidBST(BinarySearchTree.TreeNode root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static boolean isValid(BinarySearchTree.TreeNode root, int min, int max) {
        if(root == null) return true;

        if(root.val < min || root.val > max) return false;

        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }
}
