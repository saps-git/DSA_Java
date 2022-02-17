package com.dsa.others;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target){
        int start = 0, end = nums.length;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;

            if(nums[mid] < target) start = mid+1;
            else end = mid-1;
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 12;
        System.out.println(binarySearch(nums, target));
    }
}
