package com.dsa.questions.leetcode;

//Leetcode-153

public class MinimumRotatedArray {
    public static int findMin(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid > 0 && nums[mid] < nums[mid-1]) return mid;
            else if(nums[start] <= nums[mid] && nums[mid] > nums[end]) start = mid+1;
            else end = mid-1;
        }
        return nums[start]; //this will return the first number in case it is not rotated
    }
    public static void main(String[] args) {
        int[] nums = {11,13,15,17,1,2,3};
        System.out.println(findMin(nums));
    }
}
