package com.dsa.leetcode.DP;

//Leetcode-416

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TODO: CORRECT RECURSIVE SOLUTION, FIND A BETTER DP SOLUTION
public class EqualPartitionSubset {
    public static boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i: nums) sum += i;
        return helperFunc(nums, new ArrayList<>(), 0, 0, sum);
    }
    public static boolean helperFunc(int[] nums, List<Integer> curr, int total, int i, int sum) {
        if(i == nums.length) return false;
        if(total == sum) {
            System.out.println(curr);
            return true;
        }

        total += nums[i];
        sum -= nums[i];
        curr.add(nums[i]);
        if(helperFunc(nums, curr, total, i+1, sum)) return true;
        else {
            total -= nums[i];
            sum += nums[i];
            curr.remove(curr.size()-1);
            return helperFunc(nums, curr, total, i + 1, sum);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,6,7};
        System.out.println(canPartition(nums));
    }
}
