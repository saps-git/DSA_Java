package com.dsa.tree;

import static com.dsa.tree.Preorder.*;
import static com.dsa.tree.Inorder.*;
import static com.dsa.tree.PostOrder.*;
import static com.dsa.tree.LevelOrder.*;
import static com.dsa.tree.MaxOfBT.*;

public class BinaryTree {
    private static TreeNode root;

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int data; //this should be generic type

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static void create() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);

        root = first; // root ---> first
        first.left = second;
        first.right = third;// second <--- first ---> right

        second.left = fourth;
        second.right = fifth; // fourth <--- second ---> fifth

        third.left = sixth; // sixth <--- third ---> null
    }

    public static void main(String[] args) {
        create();
        System.out.println(maxOfBT(root));
    }
}
