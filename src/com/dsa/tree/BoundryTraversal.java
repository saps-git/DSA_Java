package com.dsa.tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class BoundryTraversal {
    public static boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public static void leftBoundary(TreeNode root, List<Integer> ans) {
        if(root == null || isLeaf(root)) return;
        ans.add(root.data);
        if(root.left != null) {
            leftBoundary(root.left, ans);
        } else {
            leftBoundary(root.right, ans);
        }
    }

    public static void leafNodes(TreeNode root, List<Integer> ans) {
        if(root == null) return;

        if(isLeaf(root)) {
            ans.add(root.data);
        } else {
            leafNodes(root.left, ans);
            leafNodes(root.right, ans);
        }
    }

    public static void rightBoundary(TreeNode root, List<Integer> ans) {
        if(root == null || isLeaf(root)) return;
        if(root.right != null) {
            rightBoundary(root.right, ans);
        } else {
            rightBoundary(root.left, ans);
        }
        ans.add(root.data);
    }

    public static List<Integer> printBoundary(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        if(!isLeaf(root)) ans.add(root.data);

        leftBoundary(root.left, ans);
        leafNodes(root, ans);
        rightBoundary(root.right, ans);

        return ans;
    }

    public static void main(String args[]) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(4);
        root.left.left.right.left = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.left.left = new TreeNode(10);
        root.right.right.left.right = new TreeNode(11);

        System.out.println(printBoundary(root));
    }
}
