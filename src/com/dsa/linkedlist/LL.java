package com.dsa.linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {this.size = 0;}

    private class Node {
        private int data;
        private Node next;
        
        public Node(int data) {
            this.data = data;
        }
        
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    
    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        
        if(tail == null) node = head;
        
        size += 1;
    }
    
    public void insertLast(int data) {
        if(tail == null) {
            insertFirst(data);
            return;
        }

        Node node = new Node(data);
        tail.next = node;
        tail = node;
    }

    public void insert(int data) {
        Node node = new Node(data);
        node.next = null;
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size += 1;
    }

    public static void main(String[] args) {
        
    }
}

