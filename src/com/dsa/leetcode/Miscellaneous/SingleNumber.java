package com.dsa.leetcode.Miscellaneous;

//Leetcode-136

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i: nums) {
            ans ^= i;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,2,1};
        System.out.println(singleNumber(nums));
    }
}
