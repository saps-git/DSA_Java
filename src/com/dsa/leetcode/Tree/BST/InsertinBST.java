package com.dsa.leetcode.Tree.BST;

//Leetcode-701

public class InsertinBST {
    public BinarySearchTree.TreeNode insertIntoBST(BinarySearchTree.TreeNode root, int val) {
        if(root == null) {
            return new BinarySearchTree.TreeNode(val);
        }

        if(val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}
