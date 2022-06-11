package com.dsa.leetcode.BinarySearch;

//Leetcode-852

public class PeakIdxMountainArr {
    //Noobway
//    public static int peakIndexInMountainArray(int[] nums) {
//        int ans = -1;
//        for(int i=0;i<nums.length-1;i++){
//            if(nums[i] > ans) ans = i;
//        }
//        return ans;
//    }

    //Proway (easy explained)
    public static int peakIndexInMountainArray(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return nums[mid];
            else if(nums[mid] < nums[mid-1]) end = mid;
            else start = mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] nums = {0,1,2,3,2,1};
        int[] nums = {4,3,2,1};
        System.out.println(peakIndexInMountainArray(nums));
    }
}
