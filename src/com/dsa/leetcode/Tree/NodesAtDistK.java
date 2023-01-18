package com.dsa.leetcode.Tree;

//Leetcode-863

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class NodesAtDistK {
    static HashMap<BinaryTree.TreeNode,BinaryTree.TreeNode> map = new HashMap<>();
    static HashSet<BinaryTree.TreeNode> set = new HashSet<>();
    public static void parentMap(BinaryTree.TreeNode curr, BinaryTree.TreeNode parent) {
        if(curr == null) return;

        map.put(curr, parent);
        parentMap(curr.left, curr);
        parentMap(curr.right, curr);
    }
    public static void search(BinaryTree.TreeNode target, int k, List<Integer> ans) {
        if(target == null) return;
        if(set.contains(target)) return;
        set.add(target);

        if(k == 0) ans.add(target.val);
        search(target.left, k-1, ans);
        search(target.right, k-1, ans);
        search(map.get(target), k-1, ans);
    }
    public static List<Integer> distanceK(BinaryTree.TreeNode root, BinaryTree.TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        if(root == null || target == null) return ans;
        parentMap(root, null);
        search(target, k, ans);
        return ans;
    }
}
