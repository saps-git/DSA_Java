package com.dsa;

public class DuplicateElement {
    //we can use hashmaps, but here we do differently without any extra space.
    //** It won't work if the numbers are not in the range on 0 to n-1 or if there are -ve numbers,
    //basically sucky algorithm
    //better approach is using slow fast pointer as used in Leetcode 287
    public static int duplicate(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            if(nums[Math.abs(nums[i])] < 0) return Math.abs(nums[i]);
            nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
        }

        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,7,4,5,6,7,8};
        System.out.println(duplicate(nums));
    }
}
