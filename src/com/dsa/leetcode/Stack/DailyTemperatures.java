package com.dsa.leetcode.Stack;

//Leetcode-739

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--) {
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()])
                st.pop();
            ans[i] = st.isEmpty() ? 0 : st.peek()-i;
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
