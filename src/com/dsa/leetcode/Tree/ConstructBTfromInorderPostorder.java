package com.dsa.leetcode.Tree;

//Leetcode-106

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ConstructBTfromInorderPostorder {
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
    public static Node buildTree(int[] postorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++) {
            map.put(inorder[i], i);
        }

        return build(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1, map);
    }
    public static Node build(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> map) {
        if(postStart > postEnd || inStart > inEnd) return null;

        Node root = new Node(postorder[postEnd]);
        int inRoot = map.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = build(postorder, postStart, postStart+numsLeft-1, inorder, inStart, inRoot-1, map);
        root.right = build(postorder, postStart+numsLeft, postEnd-1, inorder, inRoot+1, inEnd, map);

        return root;
    }
    public static void main(String[] args) {
        int[] preorder = {9,15,7,20,3};
        int[] inorder = {9,3,15,20,7};
        Node ans = buildTree(preorder, inorder);
        levelOrder(ans);
    }
}
