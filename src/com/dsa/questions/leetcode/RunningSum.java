package com.dsa.questions.leetcode;

//Leetcode-1480

import java.util.Arrays;

public class RunningSum {
    public static int[] runningSum(int[] nums){
        if(nums.length <= 1) return nums;

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }

        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
