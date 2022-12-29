package com.dsa.leetcode.Recursion;

//Leetcode-698

public class PartitionKEqualSubSetSum {
    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int i: nums) sum += i;
        int partition = sum/k;
        return isPartition(nums, k, partition, new boolean[nums.length], 0, 0);
    }
    public static boolean isPartition(int[] nums, int k, int partition, boolean[] temp, int i, int curr) {
        if(k == 1) return true;
        if(curr == partition) {
            return isPartition(nums, k-1, partition, temp, 0, 0);
        }
        //if(i == nums.length || curr > partition) return false;

        for(int j=i;j<nums.length;j++) {
            if(!temp[j]) {
                temp[j] = true;
                curr += nums[j];
                if (isPartition(nums, k, partition, temp, i + 1, curr)) return true;
                curr -= nums[j];
                temp[j] = false;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        //int[] nums = {4,3,2,3,5,2,1};
        int[] nums = {2,2,2,2,3,4,5};
        int k = 4;
        System.out.println(canPartitionKSubsets(nums, k));
//        [4,3,2,3,5,2,1]
//        4
    }
}
