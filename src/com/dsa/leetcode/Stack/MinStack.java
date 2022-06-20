package com.dsa.leetcode.Stack;

//Leetcode-155

import java.util.Stack;

public class MinStack {
    //Noobway, O(2n) Space with 2 stacks, but gave better result on leetcode

    Stack<Integer> st;
    Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if(min.isEmpty() || min.peek() >=  val)  min.push(val);
    }

    public void pop() {
        if(st.isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        if(st.peek().equals(min.peek())) min.pop();
        st.pop();
    }

    public int top() {
        if(st.isEmpty()) return -1;
        return st.peek();
    }

    public int getMin() {
        if(min.isEmpty()) return -1;
        else return min.peek();
    }

    //Proway, with O(n) Single stack, but the above one gave better result on leetcode

    /*Stack<Integer> st;
    int min;
    public MinStack() {
        st = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if(st.empty()) {
            st.push(val);
            min = val;
        } else {
            if(val >= min) st.push(val);
            else {
                int x = 2*val - min;
                st.push(x);
                min = val;
            }
        }
    }

    public void pop() {
        if(st.isEmpty()) {
            System.out.println("Underflow");
        } else {
            if(st.peek() >= min) st.pop();
            else {
                min = 2*min - st.peek();
                st.pop();
            }
        }
    }

    public int top() {
        if(st.peek() > min) return min;
        else return st.peek();
    }

    public int getMin() {
        return min;
    }*/
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        minStack.top();    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}
