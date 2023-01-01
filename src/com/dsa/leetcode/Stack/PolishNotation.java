package com.dsa.leetcode.Stack;

//Leetcode-150

import java.util.Stack;

public class PolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String str: tokens) {
            switch (str) {
                case "+" : {
                    int ans = st.pop() + st.pop();
                    st.add(ans);
                    break;
                }
                case "-":  {
                    int a = st.pop();
                    int b = st.pop();
                    int ans = b - a;
                    st.add(ans);
                    break;
                }
                case "*" : {
                    int ans = st.pop() * st.pop();
                    st.add(ans);
                    break;
                }
                case "/" : {
                    int a = st.pop();
                    int b = st.pop();
                    int ans = b / a;
                    st.add(ans);
                    break;
                }
                default : st.add(Integer.parseInt(str));
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
}
