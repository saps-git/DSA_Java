package com.dsa.tree;

public class ChildrenSum {
    public static void childrenSum(BinaryTree.TreeNode root) {
        if(root == null) return;

        //taking the initial sum of child1 + child2
        int sum = 0;
        if(root.left != null) sum += root.left.data;
        if(root.right != null) sum += root.right.data;

        //if the sum is more than the parent value,
        //just change the parent value to sum
        if(root.data <= sum) root.data = sum;
        else { //else just make both the children equal to parents value
            if(root.left != null) root.left.data = root.data;
            if(root.right != null) root.right.data = root.data;
        }

        //calling it for left and right subtree
        childrenSum(root.left);
        childrenSum(root.right);

        //while going back, making it the parent node value same as
        //child1 + child2
        int total = 0;
        if(root.left != null) total += root.left.data;
        if(root.right != null) total += root.right.data;
        // if it is not a leaf node then only change the node value,
        //otherwise it'll make it 0 i.e. null + null
        if(root.left != null || root.right != null) root.data = total;
    }
}
