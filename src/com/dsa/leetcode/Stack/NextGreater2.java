package com.dsa.leetcode.Stack;

//Leetcode-503

import java.util.Arrays;
import java.util.Stack;

public class NextGreater2 {
    public static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i=nums.length-1;i>=0;i--) st.push(nums[i]);

        int i = nums.length-1;
        while(i >= 0) {
            while(!st.empty() && nums[i] >= st.peek()) st.pop();

            if(st.empty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(nums[i]);
            i--;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}
