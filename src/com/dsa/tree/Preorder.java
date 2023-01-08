package com.dsa.tree;

import java.util.Stack;

public class Preorder {
    public static void preOrder(BinaryTree.TreeNode root) {
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void preItr(BinaryTree.TreeNode root) {
        if(root == null) return;

        Stack<BinaryTree.TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            BinaryTree.TreeNode temp = st.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null) st.push(temp.right);
            //we push right in first, because we want to print the left first
            //as stack is LIFO, hence pushing left second, will print it first
            if(temp.left != null) st.push(temp.left);
        }
        System.out.println();
    }
}
