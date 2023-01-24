package com.dsa.tree;

public class MorrisTraversal {
    // Inorder
    public static void morris(BinaryTree.TreeNode root) {
        BinaryTree.TreeNode curr = root;
        while(curr != null) {
            if(curr.left == null) {
                System.out.println(curr.data + " ");
                curr = curr.right;
            } else {
                BinaryTree.TreeNode temp = curr.left;
                while(temp.right != null && temp.right != curr) {
                    temp = temp.right;
                }
                if(temp.right == null) {
                    temp.right = curr;
                    curr = curr.left;
                } else {
                    temp.right = null;
                    System.out.println(curr.data + " ");
                    curr = curr.right;
                }
            }
        }
    }

    //Preorder
//    public static void morris(BinaryTree.TreeNode root) {
//        BinaryTree.TreeNode curr = root;
//        while(curr != null) {
//            if (curr.left == null) {
//                System.out.println(curr.data + " ");
//                curr = curr.right;
//            } else {
//                BinaryTree.TreeNode temp = curr.left;
//                while (temp.right != null && temp.right != curr) {
//                    temp = temp.right;
//                }
//                if (temp.right == null) {
//                    temp.right = curr;
//                    System.out.println(curr.data + " ");
//                    curr = curr.left;
//                } else {
//                    temp.right = null;
//                    curr = curr.right;
//                }
//            }
//        }
//    }
}
