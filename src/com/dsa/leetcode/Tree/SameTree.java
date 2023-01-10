package com.dsa.leetcode.Tree;

//Leetcode-100

//Run it on leetcode
public class SameTree {
    public boolean isSameTree(BinaryTree.TreeNode p, BinaryTree.TreeNode q) {
        if(p == null  || q == null) return p == q;

        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
