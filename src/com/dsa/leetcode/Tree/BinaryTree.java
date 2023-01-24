package com.dsa.leetcode.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static com.dsa.leetcode.Tree.BalanceBT.*;
import static com.dsa.leetcode.Tree.MaxDepth.*;
import static com.dsa.leetcode.Tree.DiameterBT.*;
import static com.dsa.leetcode.Tree.MaxPathSum.*;
import static com.dsa.leetcode.Tree.ZigZagLevelOrder.*;
import static com.dsa.leetcode.Tree.VerticalOrder.*;
import static com.dsa.leetcode.Tree.RightSideView.*;
import static com.dsa.leetcode.Tree.SymmetricBT.*;
import static com.dsa.leetcode.Tree.LowestCommonAncestor.*;
import static com.dsa.leetcode.Tree.MaxWidth.*;
import static com.dsa.leetcode.Tree.NodesAtDistK.*;
import static com.dsa.leetcode.Tree.CountNodesCompleteTree.*;
import static com.dsa.leetcode.Tree.SerializeDeserialize.*;
import static com.dsa.leetcode.Tree.FlattenBTtoLL.*;


public class BinaryTree {
    private static TreeNode root;

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val; //this should be generic type

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void create() {
//        TreeNode first = new TreeNode(1);
//        TreeNode second = new TreeNode(2);
//        TreeNode third = new TreeNode(3);
//        TreeNode fourth = new TreeNode(4);
//        TreeNode fifth = new TreeNode(5);
//        TreeNode sixth = new TreeNode(6);
//        TreeNode seventh = new TreeNode(7);
//        TreeNode eighth = new TreeNode(8);
//
//        root = first; // root ---> first
//        first.left = second;
//        first.right = third;// second <--- first ---> third
//
//        second.left = fourth;
//        second.right = fifth; // fourth <--- second ---> sixth
//
//        fourth.left = eighth;
//
//        third.left = sixth; //
//        third.right = seventh; // fifth <--- third ---> seventh
    }

    public static void levelOrder(BinaryTree.TreeNode root) {
        if(root == null) return;

        Queue<BinaryTree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            BinaryTree.TreeNode curr = queue.poll();
            System.out.print(curr.val + " ");
            if(curr.left != null) queue.offer(curr.left);
            if(curr.right != null) queue.offer(curr.right);
        }

        System.out.println();
    }

    public static void preOrder(BinaryTree.TreeNode root) {
        if(root == null) return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        //create();
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        TreeNode eighth = new TreeNode(8);
        TreeNode ninth = new TreeNode(9);
        TreeNode tenth = new TreeNode(10);

        root = first; // root ---> first
        first.left = second;
        first.right = fifth;// second <--- first ---> third

        second.left = third;
        second.right = fourth; // fourth <--- second ---> fifth

//        sixth.left = eighth;
//        sixth.right = ninth; // eighth <-- fourth --> ninth

        //third.left = sixth; //
        fifth.right = sixth; // sixth <--- third ---> seventh

        //fifth.left = tenth;

        preOrder(root);
        flatten(root);
        System.out.println();
        preOrder(root);
    }
}
