package com.dsa.leetcode.Tree.BST;

//Leetcode-99

public class RecoverBST {
    BinarySearchTree.TreeNode start;
    BinarySearchTree.TreeNode end;
    BinarySearchTree.TreeNode prev;
    public void recoverTree(BinarySearchTree.TreeNode root) {
        start = end = prev = null;
        inOrder(root);

        int temp = start.val;
        start.val = end.val;
        end.val = temp;
    }
    public void inOrder(BinarySearchTree.TreeNode root) {
        if(root == null) return;

        inOrder(root.left);
        if(prev != null && prev.val > root.val) {
            if(start == null) start = prev;
            end = root;
        }
        prev = root;
        inOrder(root.right);

    }
}
