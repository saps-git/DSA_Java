package com.dsa.leetcode.Tree.BST;

import static com.dsa.leetcode.Tree.BST.SearchinBST.*;
import static com.dsa.leetcode.Tree.BST.DeleteNode.*;
import static com.dsa.leetcode.Tree.BST.ValidateBT.*;
import static com.dsa.leetcode.Tree.BST.KthSmallest.*;
import static com.dsa.leetcode.Tree.BST.KthLargest.*;
import static com.dsa.leetcode.Tree.BST.LCAinBST.*;
import static com.dsa.leetcode.Tree.BST.BSTfromPreorder.*;
import static com.dsa.leetcode.Tree.BST.BSTIterator.*;

public class BinarySearchTree {
    private static TreeNode root;

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val; //this should be generic type

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void insert(int val) {
        root = insert(root, val);
    }

    public static TreeNode insert(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }

        if(val <= root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(TreeNode root) {
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static void preOrder(TreeNode root) {
        if(root == null) return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        insert(5);
        insert(3);
        insert(6);
        insert(2);
        insert(4);
        insert(7);
    }
}