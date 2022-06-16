package com.dsa.leetcode.Stack;

//Leetcode-901

import java.util.Stack;

public class StockSpanner {
    Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    public int next(int price) {
        int count = 0;
        while(!st.isEmpty() && price >= st.peek()[0]) count += st.pop()[1];
        count++;
        st.push(new int[]{price, count});
        return count;
    }
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        System.out.println(stockSpanner.next(100));
        System.out.println(stockSpanner.next(80));
        System.out.println(stockSpanner.next(60));
        System.out.println(stockSpanner.next(70));
        System.out.println(stockSpanner.next(60));
        System.out.println(stockSpanner.next(75));
        System.out.println(stockSpanner.next(85));
    }
}
