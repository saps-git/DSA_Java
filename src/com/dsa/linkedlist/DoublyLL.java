package com.dsa.linkedlist;

public class DoublyLL {
    private Node head;
    private int size;

    public DoublyLL() {this.size = 0;}

    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        size += 1;
    }

    public void insert(int data) {
        if(size == 0) {
            insertFirst(data);
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        Node node = new Node(data);
        temp.next = node;
        node.prev = temp;
        size += 1;
    }

    public void insertPos(int data, int pos) {
        if(pos == 0) {
            insertFirst(data);
            return;
        }

        Node temp = head;
        while(pos != 1) {
            temp = temp.next;
            pos--;
        }

        Node node = new Node(data);
        node.next = temp.next;
        node.prev = temp;
        if(temp.next != null) temp.next.prev = node;
        temp.next = node;
        size += 1;
    }

    public Node find(int val) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == val) return temp;
            else temp = temp.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        Node tail = null;
        while(temp != null) {
            System.out.print(temp.data + "->");
            tail = temp;
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();

        System.out.println("It's Rewind Time");

        while(tail != null) {
            System.out.print(tail.data + "->");
            tail = tail.prev;
        }
        System.out.print("START");
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLL doubly = new DoublyLL();
        doubly.insert(2);
        doubly.insert(4);
        doubly.insert(7);
        doubly.insert(8);
        doubly.insert(10);

        doubly.display();
        //System.out.println(doubly.find(8));
        doubly.insertPos(69, 3);
        doubly.display();
    }
}
