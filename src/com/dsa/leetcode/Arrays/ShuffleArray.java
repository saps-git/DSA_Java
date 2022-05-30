package com.dsa.leetcode.Arrays;

//Leetcode-1470

import java.util.Arrays;

public class ShuffleArray {
    //TODO: need to do the efficient approach later
    public static int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i+=2){
            ans[i] = nums[j];
            ans[i+1] = nums[n+j];
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}
