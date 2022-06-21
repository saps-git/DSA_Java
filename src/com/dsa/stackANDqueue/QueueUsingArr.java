package com.dsa.stackANDqueue;

public class QueueUsingArr {
    //Using array, where deQueue take O(n) time
    /*int[] arr;
    int capacity;
    int rear;
    public QueueUsingArr(int size) {
        arr = new int[size];
        capacity = size;
        rear = -1;
    }

    public void enQueue(int data) {
        if(rear == capacity-1) {
            System.out.println("Overflow");
            return;
        }

        rear++;
        arr[rear] = data;
    }
    public void deQueue() { //deQueue take O(n) time as all the elements are moved one idx forward
        if(rear == -1) {
            System.out.println("Underflow");
            return;
        }

        for(int i=0;i<rear;i++) arr[i] = arr[i+1];

        rear--;

    }

    public int getFront() {
        if(rear == -1) {
            System.out.println("Underflow");
            return -1;
        }

        return arr[0];
    }*/

    //Using circular array, where deQueue takes O(1) like enQueue
    int[] arr;
    int front, rear;
    int size;
    public QueueUsingArr(int size) {
        this.size = size;
        arr = new int[size];
        front = -1; rear = -1;
    }

    public void enQueue(int data) {
        if((rear+1) % size == front) {
            System.out.println("Overflow");
            return;
        }

        if(front == -1) front = 0;
        rear = (rear+1) % size;
        arr[rear] = data;
    }

    public void deQueue() {
        if(front == -1) {
            System.out.println("Underflow");
            return;
        } else if(front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    public int getFront() {
        if(front == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        QueueUsingArr q = new QueueUsingArr(5);
        q.enQueue(34);
        q.enQueue(56);
        q.enQueue(78);
        q.enQueue(46);
        q.enQueue(23);
        q.deQueue();
        q.deQueue();
        q.deQueue();
        System.out.println(q.getFront());
    }
}
