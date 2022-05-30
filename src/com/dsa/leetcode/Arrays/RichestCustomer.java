package com.dsa.leetcode.Arrays;

//Leetcode-1672

public class RichestCustomer {
    public static int maximumWealth(int[][] nums){
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=0;j<nums[i].length;j++){
                sum += nums[i][j];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(nums));
    }
}
