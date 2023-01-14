package com.dsa.leetcode.Tree;

//Leetcode-101

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricBT {
    //Recursive
    public static boolean isSymmetric(BinaryTree.TreeNode root) {
        if(root == null) return true;

        return recursive(root.left, root.right);
    }

    public static boolean recursive(BinaryTree.TreeNode left, BinaryTree.TreeNode right) {
        if(left == null || right == null) return left == right;

        if(left.val != right.val) return false;

        return recursive(left.left, right.right) && recursive(left.right, right.left);
    }


    //Iterative
//    public static boolean isSymmetric(BinaryTree.TreeNode root) {
//        if(root == null) return false;
//
//        Queue<BinaryTree.TreeNode> queue = new LinkedList<>();
//        queue.offer(root.left);
//        queue.offer(root.right);
//        while(!queue.isEmpty()) {
//            BinaryTree.TreeNode root1 = queue.poll();
//            BinaryTree.TreeNode root2 = queue.poll();
//
//            if(root1 == null && root2 == null)continue;
//            if(root1 == null || root2 == null) return false;
//            if(root1.val != root2.val) return false;
//
//            queue.offer(root1.left);
//            queue.offer(root2.right);
//
//            queue.offer(root1.right);
//            queue.offer(root2.left);
//        }
//        return true;
//    }

}
