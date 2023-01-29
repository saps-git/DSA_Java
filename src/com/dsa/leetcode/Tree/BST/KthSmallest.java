package com.dsa.leetcode.Tree.BST;

//Leetcode-230

import java.util.ArrayList;
import java.util.List;

public class KthSmallest {
    //Noobway - Storing the inorder traversal in List, and then getting the kth element from the list
//    static List<Integer> ans = new ArrayList<>();
//    public static int kthSmallest(BinarySearchTree.TreeNode root, int k) {
//        inOrder(root);
//        return ans.get(k-1);
//    }
//    public static void inOrder(BinarySearchTree.TreeNode root) {
//        if(root == null) return;
//
//        inOrder(root.left);
//        ans.add(root.val);
//        inOrder(root.right);
//    }

    //Using global vars
//    static int count = 0;
//    static int ans;
//    public static int kthSmallest(BinarySearchTree.TreeNode root, int k) {
//        inOrder(root, k);
//        return ans;
//    }
//    public static void inOrder(BinarySearchTree.TreeNode root, int k) {
//        if(root == null) return;
//
//        inOrder(root.left, k);
//        if(++count == k) {
//            ans = root.val;
//            return;
//        }
//        inOrder(root.right, k);
//    }

    //Proway
    public static int kthSmallest(BinarySearchTree.TreeNode root, int k) {
        int[] ans = new int[2];
        inOrder(root, k, ans);
        return ans[1];
    }

    public static void inOrder(BinarySearchTree.TreeNode root, int k, int[] ans) {
        if(root == null) return;

        inOrder(root.left, k, ans);
        if(++ans[0] == k) {
            ans[1] = root.val;
            return;
        }
        inOrder(root.right, k, ans);
    }
}
