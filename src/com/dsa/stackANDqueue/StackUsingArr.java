package com.dsa.stackANDqueue;

public class StackUsingArr {
    static class Stack {
        int top;
        int size;
        int[] arr;
        Stack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1;
        }
        void push(int num) {
            if(top == size-1) System.out.println("Overflow");
            else{
                top++;
                arr[top] = num;
            }
        }
        int pop() {
            int res = -1;
            if(top == -1) {
                System.out.println("Underflow");
            } else {
                res = arr[top];
                top--;
            }

            return res;
        }
        int peek() {
            int res = -1;
            if(top == -1) System.out.println("Stack empty");
            else res = arr[top];

            return res;
        }
        boolean isEmpty() {
            return top == -1;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.peek());
        System.out.println("Size of the stack before deleting any element " + s.top);
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.top);
        System.out.println("Top of the stack after deleting an element " + s.peek());
        System.out.println("Is the Stack empty " + s.isEmpty());
    }
}
