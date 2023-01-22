package com.dsa.tree;

import java.util.HashMap;
import java.util.HashSet;

public class BurningTree {
    static HashMap<BinaryTree.TreeNode, BinaryTree.TreeNode> map = new HashMap<>();
    static HashSet<BinaryTree.TreeNode> set = new HashSet<>();
    public static BinaryTree.TreeNode findNode(BinaryTree.TreeNode root, int target) {
        if(root == null) return null;

        if(root.data == target) return root;

        BinaryTree.TreeNode temp = findNode(root.left, target);
        if(temp != null) return temp;
        return findNode(root.right, target);
    }
    public static void parentMap(BinaryTree.TreeNode curr,  BinaryTree.TreeNode parent) {
        if(curr == null) return;

        map.put(curr, parent);
        parentMap(curr.left, curr);
        parentMap(curr.right, curr);
    }
    public static int burnTree(BinaryTree.TreeNode node, int k) {
        if(node == null) return k-1;
        if(set.contains(node)) return k-1;
        set.add(node);

        int lt = burnTree(node.left, k+1);
        int rt = burnTree(node.right, k+1);
        int pt = burnTree(map.get(node), k+1);

        return Math.max(pt, Math.max(lt, rt));
    }
    public static int minTime(BinaryTree.TreeNode root, int target) {
        BinaryTree.TreeNode node = findNode(root, target);
        parentMap(root, null);
        return burnTree(node, 0);
    }
}
