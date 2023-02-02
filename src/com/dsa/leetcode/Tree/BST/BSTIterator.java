package com.dsa.leetcode.Tree.BST;

//Leetcode-173

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTIterator {
//    private List<Integer> ans = new ArrayList<>();
//    int i;
//    BSTIterator(BinarySearchTree.TreeNode root) {
//        inOrder(root);
//        i = 0;
//    }
//    public int next() {
//        return ans.get(i++);
//    }
//    public boolean hasNext() {
//        return !(i == ans.size());
//    }
//    public void inOrder(BinarySearchTree.TreeNode root) {
//        if(root == null) return;
//
//        inOrder(root.left);
//        ans.add(root.val);
//        inOrder(root.right);
//    }

    private Stack<BinarySearchTree.TreeNode> stLeft = new Stack<>();
    private Stack<BinarySearchTree.TreeNode> stRight = new Stack<>();

    BSTIterator(BinarySearchTree.TreeNode root) {
        pushLeft(root);
        pushRight(root);
    }

    public int next() {
        BinarySearchTree.TreeNode curr = stLeft.pop();
        pushLeft(curr.right);
        return curr.val;
    }

    public int prev() {
        BinarySearchTree.TreeNode curr = stRight.pop();
        pushRight(curr.left);
        return curr.val;
    }

    public boolean hasNext() {
        return !stLeft.isEmpty();
    }

    public boolean hasPrev() {
        return !stRight.isEmpty();
    }

    private void pushLeft(BinarySearchTree.TreeNode root) {
        while(root != null) {
            stLeft.push(root);
            root = root.left;
        }
    }

    private void pushRight(BinarySearchTree.TreeNode root) {
        while(root != null) {
            stRight.push(root);
            root = root.right;
        }
    }
 }
