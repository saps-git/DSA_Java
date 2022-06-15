package com.dsa.leetcode.Stack;

//Leetcode-496

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreater {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        int i = nums2.length-1;
        while(i >= 0) {
            while(!st.isEmpty() && nums2[i] >= st.peek()) st.pop();
            if(st.isEmpty()) mp.put(nums2[i], -1);
            else mp.put(nums2[i], st.peek());

            st.push(nums2[i]);
            i--;
        }

        int[] ans = new int[nums1.length];
        for(int j=0;j<ans.length;j++) {
            ans[j] = mp.get(nums1[j]);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
