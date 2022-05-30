package com.dsa.leetcode.Linkedlist;

//Leetcode-25

public class ReverseKNodes {
    //TODO: PUT THE BELOW CODE IN LLTemplate.java FILE AND MAKE CHANGES ACCORDINGLY AND RUN, OR STRAIGHT UP RUN IT ON LEETCODE
    /*public Node reverseKGroup(node head, int k) {
        if(head == null || head.next == null) return head;

        Node dummy = new Node(0); //to keep track of the head, 
        dummy.next = head; //we will return this in the end
        Node curr = head, prev = dummy;

        while(curr != null) {
            Node tail = curr; //to keep track of the curr, as curr will move forward, and we will need this
            // to connect the end of reversed part
            int i = 0; //to check the multiple of k
            while(curr != null && i < k) {
                curr = curr.next; //moving the curr, till it becomes null or
                i--; // reaches a multiple of 4(where we will reverse it)
            }

            if(i != k) prev.next = tail; //this means there aren't enough nodes left (nodes in multiple of k) to reverse
            //hence, we will connect the end of prev reversed part to the tail (original pos of curr)
            else {
                prev.next = reverse(tail, k); //if enough nodes available, reverse and connect to prev
                prev = tail; //move prev to tail, for checking next available reversals
            }
        }
        return dummy.next; //returning head
    }
    private Node reverse(Node node, int k) { //normal reverse function
        Node curr = head, prev = null;
        while(curr != null && k > 0) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            k--;
        }
        return prev; 
    }*/
}
