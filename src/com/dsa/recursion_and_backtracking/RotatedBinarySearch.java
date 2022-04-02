package com.dsa.recursion_and_backtracking;

public class RotatedBinarySearch {
    public static int helper(int[] nums, int target, int start, int end) {
        if(start > end) return -1;

        int mid = start + (end-start)/2;
        if(nums[mid] == target) return mid;

        if(nums[start] < nums[mid]) {
            if(nums[start] <= target && target < nums[mid]) return helper(nums, target, start, mid-1);
            else return helper(nums, target, mid+1, end);
        } else {
            if(nums[mid] < target && target <= nums[end]) return helper(nums, target, mid+1, end);
            return helper(nums, target, start, mid-1);
        }
    }
    public static int searchRotated(int[] nums, int target) {
        return helper(nums, target, 0, nums.length-1);
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(searchRotated(nums, target));
    }
}
