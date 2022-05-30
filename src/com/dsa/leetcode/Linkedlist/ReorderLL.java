package com.dsa.leetcode.Linkedlist;

//Leetcode-143

//reverse from mid of the list, and then follow the pattern
public class ReorderLL {
    //TODO: PUT THE BELOW CODE IN LLTemplate.java FILE AND MAKE CHANGES ACCORDINGLY AND RUN, OR STRAIGHT UP RUN IT ON LEETCODE
    /*public void reorderList(Node head) {
        Node mid = getMid(head);
        Node hs = reverse(mid);
        Node hf = head;
        while(hf != null && hs != null) {
            Node temp = hf.next; //will take an extra temp var, because the values of both the heads will change, hence
            //to keep track of the previous one
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf != null) hf.next = null;
    }
    public Node getMid(Node node) {
        Node slow = node, fast = node;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node reverse(Node node) {
        Node curr = node;
        Node prev = null;
        while(curr.next != null) {
            curr = curr.next;
            node.next = prev;
            prev = node;
            node = curr;
        }

        curr.next = prev;
        return node;
    }*/
}
