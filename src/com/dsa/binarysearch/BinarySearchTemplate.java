package com.dsa.binarysearch;

public class BinarySearchTemplate {
    public static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;

            if(nums[mid] < target) start = mid+1;
            else end = mid-1;
        }

        return -1;
    }
}
