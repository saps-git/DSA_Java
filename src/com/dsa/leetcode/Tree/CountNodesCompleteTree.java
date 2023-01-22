package com.dsa.leetcode.Tree;

//Leetcode - 222

public class CountNodesCompleteTree {
    public static int countNodes(BinaryTree.TreeNode root) {
        if(root == null) return 0;

        int lt = findHeightL(root);
        int rt = findHeightR(root);

        if(lt == rt) return (int)Math.pow(2, lt) - 1;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static int findHeightL(BinaryTree.TreeNode root) {
        int count = 0;
        while(root != null) {
            root = root.left;
            count += 1;
        }
        return count;
    }
    public static int findHeightR(BinaryTree.TreeNode root) {
        int count = 0;
        while(root != null) {
            root = root.right;
            count += 1;
        }
        return count;
    }
}
