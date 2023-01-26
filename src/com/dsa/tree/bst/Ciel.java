package com.dsa.tree.bst;

public class Ciel {
    //recursive
//    static int ciel = -1;
//    public static int findCeil(BinarySearchTree.TreeNode root, int key) {
//        find(root, key);
//        return ciel;
//    }
//    public static void find(BinarySearchTree.TreeNode root, int key) {
//        if (root == null) return;
//
//        if(root.data == key)ciel = root.data;
//
//        if(key > root.data) {
//            find(root.right, key);
//        } else {
//            ciel = root.data;
//            find(root.left, key);
//        }
//    }

    //iterative
    public static int findCeil(BinarySearchTree.TreeNode root, int key) {
        int ciel = -1;
        while(root != null) {
            if(root.data == key) return root.data;

            if(key > root.data) root = root.right;
            else {
                ciel = root.data;
                root = root.left;
            }
        }
        return ciel;
    }

}
