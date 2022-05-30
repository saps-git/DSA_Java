package com.dsa.leetcode.Arrays;

//Leetcode-1929

import java.util.Arrays;

public class ArrayConcat {
    public static int[] getConcatenation(int[] nums){
        if(nums.length < 1) return new int[0];

        int[] ans = new int[2*nums.length];
        for(int i=0;i<nums.length;i++)
            ans[i] = ans[i+nums.length] = nums[i];

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
}
