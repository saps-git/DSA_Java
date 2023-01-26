package com.dsa.tree.bst;

public class Floor {
    public static int findFloor(BinarySearchTree.TreeNode root, int key) {
        int floor = -1;
        while(root != null) {
            if(root.data == key) return root.data;

            if(key < root.data) root = root.left;
            else {
                floor = root.data;
                root = root.right;
            }
        }
        return floor;
    }
}
