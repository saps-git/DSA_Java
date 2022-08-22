package com.dsa.leetcode.Recursion;

//Leetcode-78

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfArray {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        printSet(nums, ans, new ArrayList<>(), 0);
        return ans;
    }

    public static void printSet(int[] nums, List<List<Integer>> ans, List<Integer> curr, int i) {
        if(i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        printSet(nums, ans, curr, i+1);
        curr.remove(curr.size()-1);
        printSet(nums, ans, curr, i+1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }

}
