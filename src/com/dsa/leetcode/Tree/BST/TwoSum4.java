package com.dsa.leetcode.Tree.BST;

//Leetcode-653

import java.util.Stack;

class BSTItr {
    Stack<BinarySearchTree.TreeNode> st = new Stack<>();
    boolean reverse;
    BSTItr(BinarySearchTree.TreeNode root, boolean reverse) {
        this.reverse = reverse;
        pushAll(root);
    }
    public int next() {
        BinarySearchTree.TreeNode curr = st.pop();
        if(reverse) pushAll(curr.left);
        else pushAll(curr.right);
        return curr.val;
    }
    public void pushAll(BinarySearchTree.TreeNode root) {
        while(root != null) {
            st.push(root);
            if(reverse) root = root.right;
            else root = root.left;
        }
    }
}
public class TwoSum4 {
    public static boolean findTarget(BinarySearchTree.TreeNode root, int k) {
        BSTItr bsLeft = new BSTItr(root, false);
        BSTItr bsRight = new BSTItr(root, true);

        int l = bsLeft.next();
        int r = bsRight.next();
        while(l < r) {
            if(l + r == k) return true;
            if(l + r > k) r = bsRight.next();
            else l = bsLeft.next();
        }
        return false;
    }
}
