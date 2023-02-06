package com.dsa.tree.bst;

class NodeVal {
    public int maxSize, maxNode, minNode;
    NodeVal(int maxSize, int maxNode, int minNode) {
        this.maxSize = maxSize;
        this.maxNode = maxNode;
        this.minNode = minNode;
    }
}
public class LargestBST {
    public int largestBST(BinarySearchTree.TreeNode root) {
        return postOrder(root).maxSize;
    }
    public static NodeVal postOrder(BinarySearchTree.TreeNode root) {
        if(root == null) return new NodeVal(0, Integer.MAX_VALUE, Integer.MIN_VALUE);

        NodeVal lt = postOrder(root.left);
        NodeVal rt = postOrder(root.right);

        if(root.data > lt.maxNode && root.data < rt.minNode) {
            return new NodeVal(1 + lt.maxSize + rt.maxSize, Math.min(lt.maxNode, root.data), Math.max(rt.minNode, root.data));
        } else {
            return new NodeVal(Math.max(lt.maxSize, rt.maxSize), Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    }
}
