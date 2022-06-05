package com.dsa.binarysearch;

public class InfiniteArrayBS {
    public static int search(int[] nums, int target) {
        int low = 0, high = 1;
        while(nums[high] < target) {
            low = high;
            high = 2 * high;
        }
        
        while(low < high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high--;
            else low++;
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 200, 210, 267, 289, 300, 325, 345, 350, 390, 400};
        int target = 210;
        System.out.println(search(nums, target));
    }
}
