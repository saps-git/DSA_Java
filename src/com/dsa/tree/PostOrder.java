package com.dsa.tree;

import java.util.Stack;

public class PostOrder {
    public static void postOrder(BinaryTree.TreeNode root) {
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void postItr(BinaryTree.TreeNode root) {
        if(root == null) return;

        Stack<BinaryTree.TreeNode> st = new Stack<>();
        BinaryTree.TreeNode current = root;
        while(!st.isEmpty() || current != null) {
            if(current != null) {
                st.push(current);
                current = current.left;
            } else { //because even if we get null, we need to bes sure
                BinaryTree.TreeNode temp = st.peek().right; //that it is null on right side
                //as we need to print right child before we print root
                if(temp == null) { //making sure right is null too
                    temp = st.pop();
                    System.out.print(temp.data + " ");
                    while (!st.empty() && temp == st.peek().right) {
                        //while returning we check if stack top element' right
                        //is the element we popped out, then we can pop the stack
                        //top element also now
                        temp = st.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp; //if right is not null, then pointing the current
                    //pointer to right child, so we can continue the traversal from there
                }
            }
        }
        System.out.println();
    }

}
