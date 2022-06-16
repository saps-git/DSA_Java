package com.dsa.leetcode.Stack;

//Leetcode-20

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') st.push(ch);
            else {
                if(st.isEmpty()) return false;
                char x = st.pop();
                if(( x == '(' && ch == ')' ) ||
                    ( x == '{' && ch == '}' ) ||
                    ( x == '[' && ch == ']' ))
                    continue;

                else return false;
            }
        }

        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()[{}()]";
        System.out.println(isValid(s));
    }
}
