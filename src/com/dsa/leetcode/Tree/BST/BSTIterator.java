package com.dsa.leetcode.Tree.BST;

//Leetcode-173

import java.util.Stack;

public class BSTIterator {
    private Stack<BinarySearchTree.TreeNode> st = new Stack<>();
    BSTIterator(BinarySearchTree.TreeNode root) {
        pushLeft(root);
    }
    public int next() {
        BinarySearchTree.TreeNode curr = st.pop();
        pushLeft(curr.right);
        return curr.val;
    }
    public boolean hasNext() {
        return !st.isEmpty();
    }
    private void pushLeft(BinarySearchTree.TreeNode root) {
        while(root != null) {
            st.push(root);
            root = root.left;
        }
    }
 }
