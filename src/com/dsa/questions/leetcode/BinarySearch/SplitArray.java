package com.dsa.questions.leetcode.BinarySearch;

//Leetcode-410, 1011

public class SplitArray {
    public static int splitArray(int[] nums, int m) {
        int start = 0, end = 0;
        for(int i=0;i<nums.length;i++){
            start = Integer.max(start, nums[i]); // in the end of the loop this will contain the max item of the array
            end += nums[i]; // in the end of the loop, it'll contain the sum of all the elements
        }

        while(start < end) {
            int mid = start + (end-start)/2; // try for the middle as potential ans

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0, pieces = 1;
            for(int num: nums) {
                if(sum + num > mid){
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if(pieces > m) start = mid+1;
            else end = mid;
        }
        return end; //here start == end
    }
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums, m));
    }
}
