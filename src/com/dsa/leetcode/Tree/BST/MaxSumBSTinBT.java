package com.dsa.leetcode.Tree.BST;

//Leetcode-1373

class NodeVal{
    int maxSum, minNode, maxNode;
    NodeVal(int maxSum, int minNode, int maxNode) {
        this.maxSum = maxSum;
        this.minNode = minNode;
        this.maxNode = maxNode;
    }
}
public class MaxSumBSTinBT {
    int ans = 0;
    public int maxSumBST(BinarySearchTree.TreeNode root) {
        maxSumHelper(root);
        return Math.max(ans, 0);
    }
    public NodeVal maxSumHelper(BinarySearchTree.TreeNode root) {
        if(root == null) return new NodeVal(0, Integer.MAX_VALUE, Integer.MIN_VALUE);

        NodeVal lt = maxSumHelper(root.left);
        NodeVal rt = maxSumHelper(root.right);

        if(root.val > lt.maxNode && root.val < rt.minNode) {
            ans = Math.max(ans, lt.maxSum + rt.maxSum + root.val);
            return new NodeVal(lt.maxSum + rt.maxSum + root.val, Math.min(root.val, lt.minNode), Math.max(root.val, rt.maxNode));
        } else {
            return new NodeVal(Math.max(lt.maxSum, rt.maxSum), Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    }
}