package com.dsa.linkedlist;

public class LL {
    private Node head;
    private int size;

    public LL() {this.size = 0;}

    private class Node {
        private int data;
        private Node next;
        
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
            size -= 1;
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

    public int deletePos(int pos) {
        if(pos > size) return -1;
        if(pos == 0) return deleteFirst();
        if(pos == size) return deleteLast();
        Node temp = head;
        while(pos != 1) {
            temp = temp.next;
            pos--;
        }

        int val = temp.next.data;
        temp.next = temp.next.next;
        size -= 1;
        return val;
    }

    public Node find(int val) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == val) return temp;
            else temp = temp.next;
        }
        return null;
    }

    public Node get(int pos) {
        Node temp = head;
        while(pos != 0) {
            temp = temp.next;
            pos--;
        }

        return temp;
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
//        System.out.println(linkedList.find(10));
//        System.out.println(linkedList.get(2).data);
//
//        System.out.println(linkedList.deleteFirst());
//        System.out.println(linkedList.deleteLast());
//        System.out.println(linkedList.deletePos(3));
//        linkedList.display();

    }
}

