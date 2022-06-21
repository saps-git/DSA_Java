package com.dsa.leetcode.Queue;

//Leetcode-232

import java.util.Stack;

public class MyQueue {

    Stack<Integer> input;
    Stack<Integer> output;
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if(output.isEmpty()) {
            while(!input.isEmpty()) output.push(input.pop());
        }

        return output.pop();
    }

    public int peek() {
        if(output.isEmpty()) {
            while(!input.isEmpty()) output.push(input.pop());
        }

        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}
