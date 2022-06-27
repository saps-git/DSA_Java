package com.dsa.linkedlist;

public class LLTemplate2 {
    private static Node head;
    public LLTemplate2() {this.head = null;}

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

    public void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public boolean detectCycle() {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow.data == fast.data) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        LLTemplate2 ll = new LLTemplate2();
        head = ll.insert(1);
        head.next = ll.insert(2);
        head.next.next = ll.insert(3);
        head.next.next.next = ll.insert(4);
        head.next.next.next.next = ll.insert(5);
        head.next.next.next.next.next = ll.insert(6);
        head.next.next.next.next.next.next =  head.next.next.next;
        ll.traverse();
    }
}


