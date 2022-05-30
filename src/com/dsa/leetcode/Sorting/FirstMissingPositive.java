package com.dsa.leetcode.Sorting;

//Leetcode-41

public class FirstMissingPositive {
    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i < nums.length) {
            int correctIdx = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[correctIdx] != nums[i]) swap(nums, i, correctIdx);
            else i++;
        }

        for(int j=0;j<nums.length;j++) {
            if(nums[j] != j+1) {
                return j+1;
            }
        }

        return nums.length+1;
    }
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
    }
}
