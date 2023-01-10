package com.dsa.leetcode.Tree;

//Leetcode-543

public class DiameterBT {
//    public static int diameterOfBinaryTree(BinaryTree.TreeNode root) {
//        if(root == null) return 0;
//
//        int leftDiameter = diameterOfBinaryTree(root.left);
//        int rightDiameter = diameterOfBinaryTree(root.right);
//
//        //calculating height by calling the height function,
//        int leftHeight = height(root.left);
//        int rightHeight = height(root.right);
//
//        //adding the current node to both the heights to find the
//        //diameter when the current node is part of the diameter
//        int curr = 1 + leftHeight + rightHeight;
//
//        return Math.max(curr, Math.max(leftDiameter, rightDiameter));
//    }
//    public static int height(BinaryTree.TreeNode root) {
//        if(root == null) return 0;
//
//        int lHeight = height(root.left);
//        int rHeight = height(root.right);
//
//        return 1 + Math.max(lHeight, rHeight);
//    }

    static int diameter;
    public  static int diameterOfBinaryTree(BinaryTree.TreeNode root) {
        if(root == null) return 0;

        int leftHeight = diameterOfBinaryTree(root.left);
        int rightHeight = diameterOfBinaryTree(root.right);

        diameter = Math.max(diameter, 1 + leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);

    }
}

