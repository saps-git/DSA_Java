package com.dsa.stackANDqueue;

import java.util.Stack;

public class QueueUsingStack {
    //here the enQueue takes O(N) time, either way one of deQueue or enQueue has to be O(N)
    /*Stack<Integer> input;
    Stack<Integer> output;
    public QueueUsingStack() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void enQueue(int data) {
        while(!input.isEmpty()) output.push(input.pop());
        input.push(data);
        while(!output.isEmpty()) input.push(output.pop());
    }

    public void deQueue() {
        if(input.isEmpty()) System.out.println("Underflow");
        else input.pop();
    }

    public int getFront() {
        if(input.isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        return input.peek();
    }*/

    //each operation is amortized O(1) time complexity for all the operations, space is O(2N) regardless
    Stack<Integer> input;
    Stack<Integer> output;
    public QueueUsingStack() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void enQueue(int data) {
        input.push(data);
    }

    public void deQueue() {
        if(output.isEmpty()) {
            while(!input.isEmpty()) output.push(input.pop());
        }

        output.pop();
    }

    public int getFront() {
        if(output.isEmpty()) {
            while(!input.isEmpty()) output.push(input.pop());
        }

        return output.peek();
    }

    public static void main(String[] args) {
        QueueUsingStack qst = new QueueUsingStack();
        qst.enQueue(34);
        qst.enQueue(56);
        qst.enQueue(78);
        qst.enQueue(46);
        qst.enQueue(23);
        qst.deQueue();
        qst.deQueue();
        qst.deQueue();
        System.out.println(qst.getFront());
    }
}
