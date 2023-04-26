package com.dsa.leetcode.BinarySearch;

//Leetcode-154

public class MinimumRotatedArray2 {
    public static int findMin(int[] nums) {
        int low = 0, high = nums.length-1;
        if(nums[low] < nums[high]) return nums[low]; //this will return the first number in case it is not rotated
        while(low < high) {
            int mid = low + (high-low)/2;
            if(mid > 0 && nums[mid] < nums[mid-1]) {
                return nums[mid];
            }
            else if(nums[mid] > nums[high]) low = mid+1;
            else if(nums[mid] < nums[high]) high = mid-1;
            else high--;
        }
        return nums[low]; //or nums[high]
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,3,3,3,3,3,3};
        System.out.println(findMin(nums));
    }
}
