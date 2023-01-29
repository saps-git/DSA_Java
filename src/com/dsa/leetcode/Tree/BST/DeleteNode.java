package com.dsa.leetcode.Tree.BST;

//Leetcode-450

public class DeleteNode {
    public static BinarySearchTree.TreeNode deleteNode(BinarySearchTree.TreeNode root, int key) {
        if(root == null) return root;

        if(root.val == key) {
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;

            BinarySearchTree.TreeNode curr = root.left;
            while(curr.right != null) curr = curr.right;
            curr.right = root.right;
            return root.left;
        }

        if(key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }

        return root;
    }
}
