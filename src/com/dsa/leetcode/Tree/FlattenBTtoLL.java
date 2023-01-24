package com.dsa.leetcode.Tree;

//Leetcode-114

public class FlattenBTtoLL {
    // O(N) space, recursion stack space
//    public static void flatten(BinaryTree.TreeNode root) {
//        tailChange(root);
//    }
//    public static BinaryTree.TreeNode tailChange(BinaryTree.TreeNode root) {
//        if(root == null) return null;
//
//        BinaryTree.TreeNode lt = tailChange(root.left);
//        BinaryTree.TreeNode rt = tailChange(root.right);
//
//        if(lt != null) {
//            lt.right = root.right;
//            root.right = root.left;
//            root.left = null;
//        }
//        return rt != null ? rt : lt != null ? lt : root;
//    }

    //Using Morris Traversal
    public static void flatten(BinaryTree.TreeNode root) {
        BinaryTree.TreeNode curr = root;
        while(curr != null) {
            if (curr.left != null) {
                BinaryTree.TreeNode temp = curr.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}
