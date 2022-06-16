package com.dsa.stackANDqueue;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    //Noobway O(n*n)
    /*public static int[] stockSpan(int[] stock) {
        int[] ans = new int[stock.length];
        for(int i=0;i<stock.length;i++) {
            int res = 0;
            for(int j=i;j>=0;j--) {
                if(stock[j] > stock[i]) break;
                res += 1;
            }
            ans[i] = res;
        }

        return ans;
    }*/

    //Leetcode way
    /*public static int[] stockSpan(int[] stock) {
        Stack<int[]> st = new Stack<>();
        int[] ans = new int[stock.length];
        for(int i=0;i<stock.length;i++) {
            int count = 0;
            while (!st.isEmpty() && stock[i] >= st.peek()[0]) count += st.pop()[1];
            count++;
            st.push(new int[]{stock[i], count});
            ans[i] = count;
        }
        return ans;
    }*/
    //Proway O(n)
    public static int[] stockSpan(int[] stock) {
        int[] ans = new int[stock.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<stock.length;i++) {
            while(!st.isEmpty() && stock[i] >= stock[st.peek()]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? 1 : i - st.peek();
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] stock = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(stockSpan(stock)));
    }
}
