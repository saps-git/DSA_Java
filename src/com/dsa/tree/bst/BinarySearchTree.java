package com.dsa.tree.bst;

import static com.dsa.tree.bst.Ciel.*;
import static com.dsa.tree.bst.Floor.*;

public class BinarySearchTree {
    private static TreeNode root;

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int data; //this should be generic type

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static void insert(int val) {
        root = insert(root, val);
    }

    public static TreeNode insert(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }

        if(val <= root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(TreeNode root) {
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        insert(5);
        insert(4);
        insert(7);
        insert(2);
        insert(3);
        insert(8);
        System.out.println(findCeil(root, 6));
        System.out.println(findFloor(root, 3));
    }
}
