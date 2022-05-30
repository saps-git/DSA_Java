package com.dsa.leetcode.Arrays;

//leetcode-189

import java.util.Arrays;

public class RotateArray {
    //Noobway using extra space( space- O(n) )
//    public static void rotate(int[] nums, int k) {
//        k = k % nums.length;
//        if(k == 0) return;
//
//        int[] ans = new int[nums.length];
//
//        int n = nums.length - k ;
//        int pos = 0;
//        for(int i=n;i<nums.length;i++) {
//            ans[pos++] = nums[i];
//        }
//        for(int i=0;i<n;i++) {
//            ans[pos++] = nums[i];
//        }
//
//        for(int i=0;i<nums.length;i++) {
//            nums[i] = ans[i];
//        }
//    }

    //Proway (space - O(1) )

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
