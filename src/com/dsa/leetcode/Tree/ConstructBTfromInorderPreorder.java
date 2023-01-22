package com.dsa.leetcode.Tree;

//Leetcode-105

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ConstructBTfromInorderPreorder {
    private static Node root;

    public static class Node {
        Node left;
        Node right;
        int val; //this should be generic type

        public Node(int val) {
            this.val = val;
        }
    }
    public static void levelOrder(Node root) {
        if(root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.val + " ");
            if(curr.left != null) queue.offer(curr.left);
            if(curr.right != null) queue.offer(curr.right);
        }

        System.out.println();
    }
    public static Node buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++) {
            map.put(inorder[i], i);
        }

        Node root = build(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);

        return root;
    }

    public static Node build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> map) {
        if(preStart > preEnd || inStart > inEnd) return null;

        Node root = new Node(preorder[preStart]);
        int inRoot = map.get(root.val);
        int numLeft = inRoot - inStart;

        root.left = build(preorder, preStart+1, preStart+numLeft, inorder, inStart, inRoot-1, map);
        root.right = build(preorder, preStart+numLeft+1, preEnd, inorder, inRoot+1, inEnd, map);

        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        Node ans = buildTree(preorder, inorder);
        levelOrder(ans);
    }
}
