package com.dsa.leetcode.Tree;

import static com.dsa.leetcode.Tree.LevelOrderTraversal.*;
public class BinaryTree {
    private static TreeNode root;

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val; //this should be generic type

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void create() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first; // root ---> first
        first.left = second;
        first.right = third;// second <--- root ---> right

        second.left = fourth;
        second.right = fifth; // fourth <--- root ---> fifth
    }

    public static void main(String[] args) {
        create();
        System.out.println(levelOrder(root));
    }
}
