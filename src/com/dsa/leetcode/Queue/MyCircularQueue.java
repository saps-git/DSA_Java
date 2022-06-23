package com.dsa.leetcode.Queue;

//Leetcode-622

public class MyCircularQueue {
    int[] arr;
    int front, rear;
    int size;
    int count;
    public MyCircularQueue(int k) {
        arr = new int[k];
        size = k;
        front = -1; rear = -1;
        count = 0;
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(isEmpty()) front = 0;

        rear = (rear+1) % size;
        arr[rear] = value;

        count++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        else if(front == rear) front = rear = -1;
        else front = (front+1) % size;

        count--;
        return true;
    }

    public int Front() {
        if(isEmpty()) return -1;
        return arr[front];
    }

    public int Rear() {
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
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        System.out.println(myCircularQueue.enQueue(1));
        System.out.println(myCircularQueue.enQueue(2));
        System.out.println(myCircularQueue.enQueue(3));
        System.out.println(myCircularQueue.enQueue(4));
        System.out.println(myCircularQueue.Rear());
        System.out.println(myCircularQueue.isFull());
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.enQueue(4));
        System.out.println(myCircularQueue.Rear());
    }
}