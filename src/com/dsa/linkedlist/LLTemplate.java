package com.dsa.linkedlist;

public class LLTemplate {
    private Node head;
    private int size;

    public LLTemplate() {this.size = 0;}

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
        LLTemplate linkedList = new LLTemplate();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        linkedList.display();
    }
}
