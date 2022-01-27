package com.dsa.linkedlist;

//Leetcode-141

public class CheckCycle {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    
    static Node head;

    public static Node insert(int data){
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

    public static void traverse(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node checkCycle(Node head) {
        Node slow_ptr = head, fast_ptr = head;
        while(fast_ptr != null && fast_ptr.next != null){
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;

            if(slow_ptr == fast_ptr) {;
                slow_ptr = head;
                while(slow_ptr != fast_ptr){
                    slow_ptr = slow_ptr.next;
                    fast_ptr = fast_ptr.next;
                }
                return slow_ptr;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        head = insert(1);
        head.next = insert(2);
        head.next.next = insert(3);
        head.next.next.next = insert(4);
        head.next.next.next.next = insert(5);
        head.next.next.next.next.next = head.next.next;
        System.out.println((checkCycle(head)).data);
        
    }
}
