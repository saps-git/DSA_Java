package com.dsa.stackANDqueue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterRight {
    //Noobway Time-O(n2)
    /*public static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0;i<nums.length;i++) {
            int next = -1;
            for(int j=i+1;j<nums.length;j++) {
                if(nums[j] > nums[i]) {
                    next = nums[j];
                    break;
                }
            }
            ans[i] = next;
        }

        return ans;
    }*/

    //Proway, Time-O(n) Space-O(n)
    public static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        int i = nums.length-1;
        while(i >= 0) {
            while (!st.isEmpty() && nums[i] >= st.peek()) st.pop();
            if(st.empty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(nums[i]);
            i--;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,10,4,2,1,2,6,1,7,2,9};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}