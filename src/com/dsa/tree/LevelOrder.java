package com.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    public static void levelOrder(BinaryTree.TreeNode root) {
        if(root == null) return;

        Queue<BinaryTree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            BinaryTree.TreeNode curr = queue.poll();
            System.out.print(curr.data + " ");
            if(curr.left != null) queue.offer(curr.left);
            if(curr.right != null) queue.offer(curr.right);
        }

        System.out.println();
    }
}
