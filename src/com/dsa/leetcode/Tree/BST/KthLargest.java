package com.dsa.leetcode.Tree.BST;

public class KthLargest {
    public static int kthLargest(BinarySearchTree.TreeNode root, int k) {
        int[] ans = new int[2];
        inOrder(root, k, ans);
        return ans[1];
    }

    public static void inOrder(BinarySearchTree.TreeNode root, int k, int[] ans) {
        if(root == null) return;

        inOrder(root.right, k, ans);
        if(++ans[0] == k) {
            ans[1] = root.val;
            return;
        }
        inOrder(root.left, k, ans);
    }
}
