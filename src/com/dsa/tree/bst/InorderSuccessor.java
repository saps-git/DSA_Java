package com.dsa.tree.bst;

public class InorderSuccessor {
    //Using recursion
//    public static BinarySearchTree.TreeNode find(BinarySearchTree.TreeNode root, BinarySearchTree.TreeNode x, BinarySearchTree.TreeNode successor) {
//        if(root == null) return successor;
//
//        if(x.data < root.data) return find(root.left, x, root);
//        else return find(root.right, x, successor);
//    }

    public static BinarySearchTree.TreeNode inorderSuccessor(BinarySearchTree.TreeNode root, BinarySearchTree.TreeNode x) {
        BinarySearchTree.TreeNode successor = null;
        while(root != null) {
            if(x.data < root.data) {
                successor = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return successor;

        //return find(root, x, successor);
    }
}
