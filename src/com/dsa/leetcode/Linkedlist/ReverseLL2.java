package com.dsa.leetcode.Linkedlist;

//leetcode-92

public class ReverseLL2 {
    //TODO: PUT THE BELOW CODE IN LLTemplate.java FILE AND MAKE CHANGES ACCORDINGLY AND RUN, OR STRAIGHT UP RUN IT ON LEETCODE
    /*public Node reverseBetween(Node head, int left, int right) {
        int len = right-left; //length of the part to be reversed
        Node curr = head;
        Node prev = null;
        while(left > 1) {
            prev = curr;
            curr = curr.next;
            left--;
        } //after the while loop, the curr is at the starting element, from where reversal needs to be started
        //and prev is the element just before the reversal, which we will connect to the end of reversal

        Node start = curr; //as curr will change, hence we save it
        Node end = null;
        while(len >= 0) {
            Node temp = curr.next;
            curr.next = end;
            end = curr;
            curr = temp;
            len--;
        }

        //connecting the end points
        if(prev != null) prev.next = end; //if prev is not null(which will happen in case of two elements)
        else head = end;

        start.next = curr;
        return head;
    }*/
}
