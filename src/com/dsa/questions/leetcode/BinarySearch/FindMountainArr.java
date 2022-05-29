package com.dsa.questions.leetcode.BinarySearch;

//Leetcode-1095

public class FindMountainArr {
    public static int findInMountainArray(int[] nums, int target){
        int peak = findPeak(nums);
        int firstHalf = search(nums, target, 0, peak);
        if(firstHalf != -1) return firstHalf;
        else return search(nums, target, peak+1, nums.length-1);
    }
    public static int search(int[] nums, int target, int start, int end){
        boolean isAsc = nums[start] < nums[end];
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;

            else if(isAsc) {
                if(nums[mid] > target) end = mid-1;
                else start = mid+1;
            } else {
                if(nums[mid] > target) start = mid+1;
                else end= mid-1;
            }
        }
        return -1;
    }
    public static int findPeak(int[] nums){
        int start = 0, end = nums.length-1;
        while(start < end) { //not start <= end, because we are not doing anything with the mid element, hence infinite loop
            //and we want to return the end value
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1]) end = mid;
            else if(nums[mid] < nums[mid+1]) start = mid+1;
        }
        return end;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(nums, target));
    }
}
