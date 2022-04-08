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
    
    public void insertLast(int data) { //insert at the end with tail pointer
        if(tail == null) {
            insertFirst(data);
            return;
        }

        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int data) { //inseret at the end without tail
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

    public void insertAtPos(int data, int pos) {
        if(pos == 0) {
            insertFirst(data);
            return;
        }

        Node node = new Node(data);
        Node temp = head;
        while(pos != 1) {
            temp = temp.next;
            pos--;
        }

        node.next = temp.next;
        temp.next = node;
        size += 1;
    }

    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        size -= 1;
        return val;
    }

    public int deleteLast() {
        if(size == 1) return deleteFirst();
        if(size == 2) {
            int ans = head.next.data;
            head.next = null;
            return ans;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        size -= 1;
        return val;
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
        LL linkedList = new LL();
        linkedList.insert(2);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(10);
        linkedList.insert(13);

        linkedList.insertAtPos(15,1);
        linkedList.display();

        System.out.println(linkedList.deleteFirst());
        System.out.println(linkedList.deleteLast());

    }
}

