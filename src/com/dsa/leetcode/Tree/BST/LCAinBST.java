package com.dsa.leetcode.Tree.BST;

//Leetcode-235

//Run the code in Leetcode
public class LCAinBST {
    public static BinarySearchTree.TreeNode lowestCommonAncestor(BinarySearchTree.TreeNode root, BinarySearchTree.TreeNode p, BinarySearchTree.TreeNode q) {
        if (root == null) return null;

        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }
    }
}
