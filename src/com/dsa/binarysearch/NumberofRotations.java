package com.dsa.binarysearch;

public class NumberofRotations {
    //Number of rotation is basically the index of the minimum element, as it's index will change when array is rotated

    //Noobway O(n)
    /*public static int rotations(int[] nums) {
        int ans = Integer.MAX_VALUE, minIdx = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] < ans) {
                minIdx = i;
                ans = nums[i];
            }
        }

        return minIdx;
    }*/

    //Proway (logn)
    public static int rotations(int[] nums) {
        int start = 0, end = nums.length;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] < nums[mid-1 % nums.length]) return mid;
            else if(nums[mid] <= nums[start] && nums[mid] > nums[end]) start = mid+1;
            else end = mid-1;
        }
        return start;
    }
    public static void main(String[] args) {
        int[] nums = {11,12,15,18,2,5,6,8};
        System.out.println(rotations(nums));
    }
}
