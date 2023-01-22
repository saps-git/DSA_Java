package com.dsa.leetcode.Tree;

//Leetcode-297

import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserialize {
    public static String serialize(BinaryTree.TreeNode root) {
        if(root == null) return "";
        StringBuilder st = new StringBuilder();
        Queue<BinaryTree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //We'll do a simple level order traversal, and wherever there's a null, we'll add '#' to the string
        while (!queue.isEmpty()) {
            BinaryTree.TreeNode curr = queue.poll();
            if(curr == null) {
                st.append("# ");
                continue; //we'll continue from here, so that it doesn't keep on adding nulls
            }
            st.append(curr.val + " ");
            //since we need to add null values also, hence we'll straight up add the left and right values regardless
            queue.offer(curr.left);
            queue.offer(curr.right);
        }
        return st.toString();
    }

    public static BinaryTree.TreeNode deserialize(String data) {
        if(data.equals("")) return null;

        String[] values = data.split(" "); //we'll convert the string to array, splitting around spaces " "
        BinaryTree.TreeNode root = new BinaryTree.TreeNode(Integer.parseInt(values[0])); //adding the first node as root

        Queue<BinaryTree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for(int i=1;i<values.length;i++) { //starting from 1, as root already added
            BinaryTree.TreeNode curr = queue.poll(); //taking out the current node
            if(!values[i].equals("#")) { //checking if it's not null, then we'll add make it left of current and
                //add it to queue
                BinaryTree.TreeNode lt = new BinaryTree.TreeNode(Integer.parseInt(values[i]));
                curr.left = lt;
                queue.offer(lt);
            }
            if(!values[++i].equals("#")) { //we'll incr the i value and check for the right child same as we did for left
                BinaryTree.TreeNode rt = new BinaryTree.TreeNode(Integer.parseInt(values[i]));
                curr.right = rt;
                queue.offer(rt);
            }
        }
        return root;
    }
}
