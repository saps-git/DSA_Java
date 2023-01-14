package com.dsa.tree;

import static com.dsa.tree.Preorder.*;
import static com.dsa.tree.Inorder.*;
import static com.dsa.tree.PostOrder.*;
import static com.dsa.tree.LevelOrder.*;
import static com.dsa.tree.MaxOfBT.*;
import static com.dsa.tree.TopView.*;
import static com.dsa.tree.BottomView.*;
import static com.dsa.tree.PathToNode.*;

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
        TreeNode seventh = new TreeNode(7);

        root = first; // root ---> first
        first.left = second;
        first.right = third;// second <--- first ---> third

        second.left = fourth;
        second.right = fifth; // fourth <--- second ---> fifth

        third.left = sixth;
        third.right = seventh; // sixth <--- third ---> seventh
    }

    public static void main(String[] args) {
        create();

    }
}
