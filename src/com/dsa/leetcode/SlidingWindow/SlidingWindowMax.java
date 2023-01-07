package com.dsa.leetcode.SlidingWindow;

//Leetcode-239

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMax {
    //Noobway time - O(n * k) n - length of array, k - size of window
    /*public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        for(int i=0;i<nums.length-k+1;i++) {
            int sol = nums[i];
            for(int j=0;j<k;j++) {
                sol = Math.max(sol, nums[i+j]);
            }
            ans[i] = sol;
        }

        return ans;
    }*/

    //Proway
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0, j = 0;
        Deque<Integer> deq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        int idx = 0;
        while(j < nums.length) {
            while(!deq.isEmpty() && nums[j] > deq.peekLast()) deq.pollLast();
            deq.offerLast(nums[j]);
            if((j-i) + 1 == k) {
                ans[idx++] = deq.peekFirst();
                if(nums[i] == deq.peekFirst()) deq.pollFirst();
                i++;
            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
