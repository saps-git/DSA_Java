package com.dsa.linkedlist;

//Just loop through the list, if the curr element is same as curr.next, point the curr.next to curr.next.next,
//else just move the curr forward and repeat the same.

public class RemoveDuplicates {
    ////TODO: PUT THE BELOW CODE IN LLTemplate.java FILE AND MAKE CHANGES ACCORDINGLY AND RUN
    /*public Node deleteDuplicates(Node head) {
        LLTemplate.Node curr = head;
        while(curr.next != null) {
            if(curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        linkedList.insert(1);
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(3);

        linkedList.display();
        linkedList.deleteDuplicates(head);
        linkedList.display();
    }*/
}
