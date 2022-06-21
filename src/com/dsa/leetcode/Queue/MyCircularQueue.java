package com.dsa.leetcode.Queue;

//Leetcode-622

public class MyCircularQueue {
    int[] arr;
    int front, rear;
    int size;
    public MyCircularQueue(int k) {
        arr = new int[k];
        size = k;
        front = -1; rear = -1;
    }

    public boolean enQueue(int value) {
        if((rear+1) % size == front) return false;
        if(front == -1) front = 0;
        rear = (rear+1) % size;
        arr[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if(front == -1) return false;
        else if(front == rear) front = rear = -1;
        else front = (front+1) % size;
        return true;
    }

    public int Front() {
        if(front == -1) return -1;
        return arr[front];
    }

    public int Rear() {
        if(rear == -1) return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        if(front == -1) return true;
        return false;
    }

    public boolean isFull() {
        if((rear+1) % size == front) return true;
        return false;
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        myCircularQueue.enQueue(1);
        myCircularQueue.enQueue(2);
        myCircularQueue.enQueue(3);
        myCircularQueue.enQueue(4);
        System.out.println(myCircularQueue.Rear());
        System.out.println(myCircularQueue.isFull());
        myCircularQueue.deQueue();
        myCircularQueue.enQueue(4);
        System.out.println(myCircularQueue.Rear());
    }
}