package com.dsa.stackANDqueue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterLeft {
    public static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while(i < nums.length) {
            while (!st.isEmpty() && nums[i] >= st.peek()) st.pop();
            if(st.empty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(nums[i]);
            i++;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,10,4,2,1,2,6,1,7,2,9};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}
