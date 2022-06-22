package com.dsa.stackANDqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    //Time O(N), for push, but pop & top O(1), Space O(2N)
    /*Queue<Integer> q1;
    Queue<Integer> q2;
    public StackUsingQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()) q2.add(q1.poll());
        while(!q2.isEmpty()) q1.add(q2.poll());
    }

    public int pop() {
        if(q1.isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }

        return q1.poll();
    }

    public int top() {
        if(q1.isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }

        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }*/

    //The Time O(N) will be the same, but we can improve the space complexity, by using single queue, hence O(N)
    Queue<Integer> q;
    public StackUsingQueue() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for(int i=0;i<q.size()-1;i++) {
            int n = q.poll();
            q.add(n);
        }
    }

    public int pop() {
        if(q.isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }

        return q.poll();
    }

    public int top() {
        if(q.isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }

        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stckQue = new StackUsingQueue();
        stckQue.push(1);
        stckQue.push(2);
        stckQue.push(3);
        stckQue.push(4);
        System.out.println(stckQue.top());
        stckQue.pop();
        System.out.println(stckQue.top());
        System.out.println(stckQue.empty());
    }
}
