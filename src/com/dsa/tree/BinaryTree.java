package com.dsa.tree;

import static com.dsa.tree.Preorder.*;
import static com.dsa.tree.Inorder.*;
import static com.dsa.tree.PostOrder.*;
import static com.dsa.tree.LevelOrder.*;

public class BinaryTree {
    private TreeNode root;

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int data; //this should be generic type

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void create() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first; // root ---> first
        first.left = second;
        first.right = third;// second <--- root ---> right

        second.left = fourth;
        second.right = fifth; // fourth <--- root ---> fifth
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.create();

        preOrder(bt.root);
        System.out.println();
        preItr(bt.root);

        inOrder(bt.root);
        System.out.println();
        inItr(bt.root);

        postOrder(bt.root);
        System.out.println();
        postItr(bt.root);

        levelOrder(bt.root);
    }
}
