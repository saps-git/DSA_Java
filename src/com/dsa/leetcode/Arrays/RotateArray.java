package com.dsa.leetcode.Arrays;

//leetcode-189

import java.util.Arrays;

public class RotateArray {
    //using extra space( space- O(n) )
   /* public static void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            temp[(i+k)%nums.length] = nums[i];
        }

        int i=0;
        for(int n: temp) nums[i++] = n;
    }*/

    //use a pen and paper you'll understand
    //just reversing and swapping
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
