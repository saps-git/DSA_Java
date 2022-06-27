package com.dsa.linkedlist;

public class CycleinLL {
    private static Node head;
    public CycleinLL() {this.head = null;}

    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public Node insert(int data){
        Node toAdd = new Node(data);
        toAdd.next = null;

        if(head == null) head = toAdd;

        else{
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;

            temp.next = toAdd;
        }

        return toAdd;
    }

    public boolean hasCycle() {
        Node fast = head, slow = head;
        while(fast != null && fast.next != null) { //because in case there is no cycle fast will reach to the end first,
            //hence we check if fast is null, also we check if fast.next is null because we gonna skip two at a time for
            //fast pointer, hence to avoid NPE.
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }

    public static int lengthOfCycle() {
        Node fast = head, slow = head;
        while(fast != null && fast.next != null) { 
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                int size = 0;
                do{
                    slow = slow.next;
                    size += 1;
                } while(slow != fast);
                return size;
            }
        }
        return 0;
    }

    public static Node startPoint() {
        Node fast = head, slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                slow = head;
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CycleinLL ll = new CycleinLL();
        head = ll.insert(1);
        head.next = ll.insert(2);
        head.next.next = ll.insert(3);
        head.next.next.next = ll.insert(4);
        head.next.next.next.next = ll.insert(5);
        head.next.next.next.next.next = ll.insert(6);
        head.next.next.next.next.next.next = head.next.next; //adding after 3
        System.out.println(ll.hasCycle());
        if(ll.hasCycle()) {
            System.out.println("Cycle present");
            System.out.println("length of cycle " + lengthOfCycle());
            System.out.println("Starting at node " + startPoint().data);
        } else System.out.println("No Cycle present");
    }
}

