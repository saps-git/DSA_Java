package com.dsa.leetcode.BinarySearch;

//Leetcode-1752

//in a sorted array, there's only one instance where nums[i-1] > nums[i], if we have any more instance of this
//it is not rotated and sorted
public class CheckSortedRotated {
    public static boolean check(int[] nums) {
        int count = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1] > nums[i]) count++;
        }

        if(nums[nums.length-1] > nums[0]) count++;

        return count <= 1;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(check(nums));
    }
}
