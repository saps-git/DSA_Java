package com.dsa.tree;

import java.util.ArrayList;
import java.util.List;

public class PathToNode {
    public static List<Integer> printPath(BinaryTree.TreeNode root, int x) {
        List<Integer> ans = new ArrayList<>();
        recursion(root, x, ans);
        return ans;
    }
    public static boolean recursion(BinaryTree.TreeNode root, int x, List<Integer> ans) {
        if(root == null) return false;

        ans.add(root.data);
        if(root.data == x) return true;

        if(recursion(root.left, x, ans) || recursion(root.right, x, ans)) return true;

        ans.remove(ans.size()-1);
        return false;
    }
}
