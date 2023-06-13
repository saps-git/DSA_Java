package com.dsa.leetcode.TwoPointer;

import java.util.Arrays;

//simply sorting them and doing two pointer
public class TwoSumClosest {
    public static int[] closest(int[] nums, int k) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        int left = 0, right = nums.length-1;
        int minDiff = Integer.MAX_VALUE;
        while(left < right) {
            int sum = nums[left] + nums[right];
            int diff = Math.abs(k - sum);
            if(diff < minDiff) {
                minDiff = diff;
                ans[0] = nums[left];
                ans[1] = nums[right];
            }
            if(sum > k) right--;
            else if(sum < k) left++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 60, -10, 70, -80, 85};
        int k = 0;
        System.out.println(Arrays.toString(closest(nums, k)));
    }
}
