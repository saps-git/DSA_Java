package com.dsa.leetcode.BinarySearch;

//Leetcode-162

public class PeakIdx {
    //another pro way
//    public int findPeakElement(int[] nums) {
//        int start = 0, end = nums.length-1;
//        while(start < end) {
//            int mid = start + (end-start)/2;
//            if(nums[mid] > nums[mid+1]) end = mid;
//            else if(nums[mid] < nums[mid+1]) start = mid+1;
//        }
//        return end;
//    }
    public static int findPeakElement(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid > 0 && mid < nums.length-1) {
                if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
                else if(nums[mid] < nums[mid-1]) end = mid-1;
                else start = mid+1;
            } else if(mid == 0) {
                if(nums[mid] > nums[1]) return 0;
                else return 1;
            } else if(mid == nums.length-1) {
                if(nums[mid] > nums[nums.length-2]) return nums.length-1;
                else return nums.length-2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        System.out.println(findPeakElement(nums));
    }
}
