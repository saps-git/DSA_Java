package com.dsa.leetcode.BinarySearch;

//Leetcode-410, 1011

public class SplitArray {
    public static boolean isPossible(int[] nums, int m, int mid) {
        int sum = 0, subarrays = 1;
        for(int num: nums) {
            if(sum + num > mid){
                subarrays++; // you cannot add this in this subarray, make new one
                if(subarrays > m) return false;
                sum = num; // say you add this num in new subarray, then sum = num
            } else {
                sum += num;
            }
        }
        return true;
    }
    public static int splitArray(int[] nums, int m) {
        int low = 0, high = 0;
        for (int num : nums) {
            low = Integer.max(low, num); // low will contain the max item of the array
            high += num; // high will contain the sum of all the elements
        }

        int ans = 1;
        while(low < high) {
            int mid = low + (high-low)/2; // try for the middle as potential ans
            if(isPossible(nums, m, mid)) {
                ans = mid;
                high = mid; //this could be a possible answer, but we'll look if we can find a smaller one
            } else {
                low = mid+1; //we made more subsets than given, hence will need to increase the sum
            }
        }
        return ans; //here low == high
    }
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums, m));
    }
}
