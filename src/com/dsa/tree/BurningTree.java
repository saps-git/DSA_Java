package com.dsa.tree;

import java.util.HashMap;
import java.util.HashSet;

public class BurningTree {
    static HashMap<BinaryTree.TreeNode, BinaryTree.TreeNode> map = new HashMap<>();
    static HashSet<BinaryTree.TreeNode> set = new HashSet<>();
    public static void parentMap(BinaryTree.TreeNode curr,  BinaryTree.TreeNode parent) {
        if(curr == null) return;

        map.put(curr, parent);
        parentMap(curr.left, curr);
        parentMap(curr.right, curr);
    }
    public static BinaryTree.TreeNode findNode(BinaryTree.TreeNode root, int target) {
        if(root == null) return null;

        if(root.data == target) return root;

        BinaryTree.TreeNode temp = findNode(root.left, target);
        if(temp != null) return temp;
        return findNode(root.right, target);
    }
    public static int search(BinaryTree.TreeNode node, int k) {
        if(node == null) return k-1;
        if(set.contains(node)) return k-1;
        set.add(node);

        int lt = search(node.left, k+1);
        int rt = search(node.right, k+1);
        int pt = search(map.get(node), k+1);

        return Math.max(pt, Math.max(lt, rt));
    }
    public static int minTime(BinaryTree.TreeNode root, int target) {
        parentMap(root, null);
        BinaryTree.TreeNode node = findNode(root, target);
        return search(node, 0);
    }
}
