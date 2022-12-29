package com.dsa.binarysearch;

public class CountOccur {
    //just find the first and the last occurence, and then last-first + 1
    public static int search(int[] nums, int target, boolean isFirst){
        int res = -1;
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]) end = mid-1;
            else if(target > nums[mid]) start = mid+1;
            else {
                res = mid;
                if(isFirst) end = mid-1;
                else start = mid+1;
            }
        }
        return res;
    }
    public static int count(int[] nums, int target) {
        int first = search(nums, target, true);
        int last = search(nums, target, false);

        return (last-first) + 1; //formula
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int target = 8;
        System.out.println(count(nums, target));
    }
}
