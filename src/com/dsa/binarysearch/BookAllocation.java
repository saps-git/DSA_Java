package com.dsa.binarysearch;

public class BookAllocation {
    public static boolean isPossible(int[] nums, int m, int pages) {
        int sum = 0, student = 1;
        for (int i : nums) {
            if(sum + i > pages) {
                student++;
                sum = i;
            } else {
                sum += i;
            }
        }
        return student <= m;
    }
    public static int minimum(int[] nums, int m) {
        int low = 0;
        int high = 0;
        for(int i: nums) {
            if(i > low) low = i;
            high += i;
        }

        int res = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(isPossible(nums, m, mid)) {
                res = mid;
                high = mid-1;
            } else low = mid+1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {12,34,67,90};
        int m = 2;
        System.out.println(minimum(nums, m));
    }
}
