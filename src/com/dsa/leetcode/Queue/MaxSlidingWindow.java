package com.dsa.leetcode.Queue;

//Leetcode-239

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxSlidingWindow {
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
        int[] ans = new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        int x = 0;
        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty() && dq.peek() == i-k) dq.poll();
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) dq.pollLast();

            dq.offer(i);
            if(i >= k-1) ans[i - (k-1)] = nums[dq.peek()];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
