package com.dsa.recursion_and_backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Sum of all the Subsets in a array
//TODO: OPTIMISE LATER WITH DP
public class SubsetSum {
    public static List<Integer> subsets(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        findSum(nums, ans, 0, 0);
        Collections.sort(ans);
        return ans;
    }
    public static void findSum(int[] nums, List<Integer> ans, int sum, int i) {
        if(i == nums.length) {
            ans.add(sum);
            return;
        }

        sum += nums[i];
        findSum(nums, ans, sum, i+1);
        sum -= nums[i];
        findSum(nums, ans, sum, i+1);

    }
    public static void main(String[] args) {
        int[] nums = {3,1,2};
        System.out.println(subsets(nums));
    }
}
