package com.dsa.questions.leetcode.Arrays;

//Leetcode-1920

import java.util.Arrays;

public class BuildArray {
    public static int[] buildArray(int[] nums){
        if(nums.length < 1) return new int[0];

        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}
