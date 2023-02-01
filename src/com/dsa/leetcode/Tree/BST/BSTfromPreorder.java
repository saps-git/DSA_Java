package com.dsa.leetcode.Tree.BST;

//Leetcode-1008

public class BSTfromPreorder {
    //Noobway O(N2) soln
//    public static BinarySearchTree.TreeNode bstFromPreorder(int[] preorder) {
//        if (preorder == null || preorder.length == 0) return null;
//
//        BinarySearchTree.TreeNode root = new BinarySearchTree.TreeNode(preorder[0]);
//
//        for(int i=1;i<preorder.length;i++) {
//            root = insert(root, preorder[i]);
//        }
//        return root;
//    }
//    public static BinarySearchTree.TreeNode insert(BinarySearchTree.TreeNode root, int val) {
//        if(root == null) {
//            return new BinarySearchTree.TreeNode(val);
//        }
//
//        if(val < root.val) {
//            root.left = insert(root.left, val);
//        } else {
//            root.right = insert(root.right, val);
//        }
//
//        return root;
//    }

    //Proway using the technique of validate a BST
    static int i = 0;
    public static BinarySearchTree.TreeNode bstFromPreorder(int[] preorder) {
        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        return makeTree(preorder, min, max);
    }
    public static BinarySearchTree.TreeNode makeTree(int[] preorder, int min, int max) {
        if(i >= preorder.length || preorder[i] < min || preorder[i] > max) return null;

        BinarySearchTree.TreeNode root = new BinarySearchTree.TreeNode(preorder[i++]);
        root.left = makeTree(preorder, min, root.val);
        root.right = makeTree(preorder, root.val, max);

        return root;
    }
}
