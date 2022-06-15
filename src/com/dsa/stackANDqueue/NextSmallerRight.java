package com.dsa.stackANDqueue;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerRight {
    public static int[] nextSmallest(int[] nums){
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        int i = nums.length-1;
        while(i >= 0) {
            while(!st.isEmpty() && nums[i] <= st.peek()) st.pop();
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(nums[i]);
            i--;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4,8,5,2,22};
        System.out.println(Arrays.toString(nextSmallest(nums)));
    }
}
