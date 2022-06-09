package com.dsa;

import java.util.Arrays;

public class Test {
    public static int[] test(int[] nums, int target) {
        int[] ans = {-1, -1};
        int low = 0, high = nums.length-1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == target) {
                ans[0] = searchRange(nums, nums[mid])
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,4,10,10,10,18,20};
        int target = 10;
        System.out.println(Arrays.toString(test(nums, target)));
    }
}
