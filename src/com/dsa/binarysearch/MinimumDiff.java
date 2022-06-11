package com.dsa.binarysearch;

public class MinimumDiff {
    public static int minDiff(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == target) return 0; //Diff with itself will be the min
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }

        return Integer.min(Math.abs(target - nums[low]), Math.abs(target - nums[high]));
    }
    public static void main(String[] args) {
        int[] nums = {1,3,8,10,12,15};
        int taregt = 14;
        System.out.println(minDiff(nums, taregt));
    }
}
