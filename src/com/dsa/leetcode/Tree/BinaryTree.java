package com.dsa.leetcode.Tree;

import java.util.Arrays;

import static com.dsa.leetcode.Tree.BalanceBT.*;
import static com.dsa.leetcode.Tree.MaxDepth.*;
import static com.dsa.leetcode.Tree.DiameterBT.*;
import static com.dsa.leetcode.Tree.MaxPathSum.*;
import static com.dsa.leetcode.Tree.ZigZagLevelOrder.*;
import static com.dsa.leetcode.Tree.VerticalOrder.*;
import static com.dsa.leetcode.Tree.RightSideView.*;
import static com.dsa.leetcode.Tree.SymmetricBT.*;
import static com.dsa.leetcode.Tree.LowestCommonAncestor.*;

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

        root = first; // root ---> first
        first.left = second;
        first.right = third;// second <--- first ---> third

        second.left = fourth;
        second.right = fifth; // fourth <--- second ---> sixth

        fourth.left = eighth;

        third.left = sixth; //
        third.right = seventh; // fifth <--- third ---> seventh

        System.out.println(lowestCommonAncestor(root, fifth, eighth).val);
    }
}
