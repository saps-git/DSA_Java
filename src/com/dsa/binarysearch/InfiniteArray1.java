package com.dsa.binarysearch;

//Find the first 1 in an array of only 0's & 1's

public class InfiniteArray1 {
    public static int infinite(int[] nums) {
        int low = 0, high = 1;
        while(nums[high] < 1) {
            low = high;
            high = high * 2;
        }

        int ans = 0;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(nums[mid] == 1) {
                ans = mid;
                high = mid-1;
            } else low = mid+1;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1};
        System.out.println(infinite(nums));
    }
}
