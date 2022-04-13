package com.dsa.linkedlist;

public class ReverseLinkedlist {
    private Node head;
    private int size;

    public ReverseLinkedlist() {this.size = 0;}

    private class Node {
        private int data;
        private Node next;
        public Node() {}
        public Node(int data) {
            this.data = data;
        }
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        size += 1;
    }

    public void insert(int data) {
        Node node = new Node(data);
        node.next = null;
        if(head == null) {
            insertFirst(data);
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size += 1;
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        while(curr.next != null) {
            curr = curr.next;
            head.next = prev;
            prev = head;
            head = curr;
        }

        curr.next = prev;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedlist linkedList = new ReverseLinkedlist();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        linkedList.display();
        linkedList.reverse();
        linkedList.display();
    }
}
