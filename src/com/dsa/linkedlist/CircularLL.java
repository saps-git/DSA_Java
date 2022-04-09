package com.dsa.linkedlist;

public class CircularLL {
    private Node head;

    public CircularLL() {head = null;}

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        head = node;
        head.next = head;
    }

    public void insert(int data) {
        if(head == null) {
            insertFirst(data);
            return;
        }

        Node temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }

        Node node = new Node(data);
        temp.next = node;
        node.next = head;
    }

    public void delete(int data) {
        Node curr = head;
        Node prev = null;

        while(curr.data != data) {
            if(curr.next == head) {
                System.out.println("element not found");
                return;
            }

            prev = curr;
            curr = curr.next;
        }

        // Check if node is only node (single element)
        if(curr == head && curr.next == curr) {
            head = null;
            return;
        }

        // If more than one node, check if it is first node
        if(curr == head) {
            prev = curr;
            while(prev.next != head) {
                prev = prev.next;
            }

            head = curr.next;
            prev.next = curr.next;
            return;
        }

        // check if node is last node
        if(curr.next == head) {
            prev.next = head;
        } else {
            prev.next = curr.next;
        }
    }

    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            if (temp.next != null) {
                temp = temp.next;
            }
        } while(temp != head);
        System.out.print("END");
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLL circular = new CircularLL();
        circular.insert(2);
        circular.insert(4);
        circular.insert(5);
        circular.insert(10);
        circular.insert(13);

        circular.display();
        circular.delete(2);
        circular.display();
    }
}
