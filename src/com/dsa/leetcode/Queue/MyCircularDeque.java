package com.dsa.leetcode.Queue;

//leetcode-641

public class MyCircularDeque {
    int front, rear;
    int[] arr;
    int size;
    int count;
    public MyCircularDeque(int k) {
        arr = new int[k];
        front = -1; rear = -1;
        size = k;
        count = 0;
    }

    public boolean insertFront(int value) {
        if(isFull()) return false;

        front = (front-1 + size) % size;
        arr[front] = value;

        if(isEmpty()) rear = front;

        count++;
        return true;
    }

    public boolean insertLast(int value) {
        if(isFull()) return false;

        rear = (rear+1) % size;
        arr[rear] = value;

        if(isEmpty()) front = rear;

        count++;
        return true;
    }

    public boolean deleteFront() {
        if(isEmpty()) return false;

        front = (front+1) % size;

        count--;
        return true;
    }

    public boolean deleteLast() {
        if(isEmpty()) return false;

        rear = (rear-1 + size) % size;

        count--;
        return true;
    }

    public int getFront() {
        if(isEmpty()) return -1;

        return arr[front];
    }

    public int getRear() {
        if(isEmpty()) return -1;

        return arr[rear];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public static void main(String[] args) {
        MyCircularDeque myCircularDeque = new MyCircularDeque(3);
        System.out.println(myCircularDeque.insertLast(1));
        System.out.println(myCircularDeque.insertLast(2));
        System.out.println(myCircularDeque.insertFront(3));
        System.out.println(myCircularDeque.insertFront(4));
        System.out.println(myCircularDeque.getRear());
        System.out.println(myCircularDeque.isFull());
        System.out.println(myCircularDeque.deleteLast());
        System.out.println(myCircularDeque.insertFront(4));
        System.out.println(myCircularDeque.getFront());
    }
}
