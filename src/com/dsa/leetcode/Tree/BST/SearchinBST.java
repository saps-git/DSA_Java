package com.dsa.leetcode.Tree.BST;

//Leetcode-700

public class SearchinBST {
    public static BinarySearchTree.TreeNode searchBST(BinarySearchTree.TreeNode root, int val) {
        if(root == null) return null;

        if(root.val == val) return root;
        if(val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}
