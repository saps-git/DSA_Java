package com.dsa.leetcode.BinarySearch;

public class MinimumRotatedArray2 {
    public static int findMin(int[] nums) {
        int start = 0, end = nums.length-1;
        while(nums[start] == nums[end] && end > start) end--;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid > 0 && nums[mid] < nums[mid-1]) return nums[mid];
            else if(nums[mid] > nums[end]) start = mid+1;
            else end = mid-1;
        }
        return nums[start]; //this will return the first number in case it is not rotated
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,3,3,3,3,3,3};
        System.out.println(findMin(nums));
    }
}
