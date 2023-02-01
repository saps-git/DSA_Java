package com.dsa.tree.bst;

public class InorderPredecessor{
    public static BinarySearchTree.TreeNode inorderPredecessor(BinarySearchTree.TreeNode root, BinarySearchTree.TreeNode x) {
        BinarySearchTree.TreeNode predecessor = null;
        while(root != null) {
            if(x.data > root.data) {
                predecessor = root;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return predecessor;
    }
}
