package com.dsa.questions.leetcode;

//Leetcode-852, 162

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
//    public static int peakIndexInMountainArray(int[] nums) {
//        int start = 0, end = nums.length-1;
//        while(start < end){
//            int mid = start + (end-start)/2;
//            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
//            else if(nums[mid] < nums[mid-1]) end = mid;
//            else start = mid;
//        }
//        return -1;
//    }

    //Proway (clean code)
    public static int peakIndexInMountainArray(int[] nums){
        int start = 0, end = nums.length-1;
        while(start < end) {
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1]) end = mid;  // you are in decreasing part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
            else if(nums[mid] < nums[mid+1]) start = mid+1; // you are in ascending part of array
        }
        //In the end start = end, so you can return either start or end
        return end;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,1,0};
        System.out.println(peakIndexInMountainArray(nums));
    }
}
