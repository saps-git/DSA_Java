package com.dsa.tree;

import java.util.Stack;

public class Inorder {
    public static void inOrder(BinaryTree.TreeNode root) {
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void inItr(BinaryTree.TreeNode root) {
        if(root == null) return;

        Stack<BinaryTree.TreeNode> st = new Stack<>();
        BinaryTree.TreeNode temp = root;
        while(!st.isEmpty() || temp != null) {
            //temp != null will come in use, at the beginning, when stack is empty
            //but temp is pointing to the initial root
            //    AND
            //when we've completed traversal on the left side, and printed
            //the initial root, so the stack would be empty. But we need to print
            //the right subtree to. Hence, then this second condition will be used.
            if(temp != null) {
                st.add(temp);
                temp = temp.left;
            } else {
                temp = st.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
        System.out.println();
    }

}
