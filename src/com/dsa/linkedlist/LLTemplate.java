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

    public void reorderList() {
        Node mid = getMid(head);
        Node hs = reverse(mid);
        Node hf = head;
        while(hf != null && hs != null) {
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf != null) hf.next = null;
    }
    public Node getMid(Node node) {
        Node slow = node, fast = node;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node reverse(Node node) {
        Node curr = node;
        Node prev = null;
        while(curr.next != null) {
            curr = curr.next;
            node.next = prev;
            prev = node;
            node = curr;
        }

        curr.next = prev;
        return node;
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
        //linkedList.insert(1);

        linkedList.display();
        linkedList.reorderList();
        linkedList.display();

    }
}
