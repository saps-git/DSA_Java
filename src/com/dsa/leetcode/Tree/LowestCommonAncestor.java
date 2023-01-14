package com.dsa.leetcode.Tree;

//Leetcode-236

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {
    //Noobway
    //Time - O(N) + O(N), Space - O(N) + O(N)
//    public static BinaryTree.TreeNode lowestCommonAncestor(BinaryTree.TreeNode root, BinaryTree.TreeNode p, BinaryTree.TreeNode q) {
//        if(root == null) return null;
//
//        List<BinaryTree.TreeNode> ans1 = new ArrayList<>(), ans2 = new ArrayList<>();
//        recursion(root, p.val, ans1);
//        recursion(root, q.val, ans2);
//
//        int i = 1, j = 1;
//        while(i < ans1.size() && j < ans2.size()) {
//            if(ans1.get(i) != ans2.get(j)) return ans1.get(i-1);
//            i++;j++;
//        }
//
//        return null;
//    }
//    public static boolean recursion(BinaryTree.TreeNode root, int x, List<BinaryTree.TreeNode> ans) {
//        if(root == null) return false;
//
//        ans.add(root);
//        if(root.val == x) return true;
//
//        if(recursion(root.left, x, ans) || recursion(root.right, x, ans)) return true;
//
//        ans.remove(ans.size()-1);
//        return false;
//    }

    public static BinaryTree.TreeNode lowestCommonAncestor(BinaryTree.TreeNode root, BinaryTree.TreeNode p, BinaryTree.TreeNode q) {
        if(root == null) return null;
        if(root == p || root == q) return root;

        BinaryTree.TreeNode lt = lowestCommonAncestor(root.left, p, q);
        BinaryTree.TreeNode rt = lowestCommonAncestor(root.right, p, q);

        if(lt == null) return rt;
        if(rt == null) return lt;
        else return root;
    }
}
