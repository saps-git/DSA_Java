package com.dsa.leetcode.Recursion;

//Leetcode-47

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Permutations2 {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findPerm(nums, ans, 0);
        return ans;
    }

    public static void findPerm(int[] nums, List<List<Integer>> ans, int i) {
        if(i == nums.length) {
            List<Integer> li = new ArrayList<>();
            for(int n: nums) li.add(n);
            ans.add(li);
            return;
        }

        HashSet<Integer> hs = new HashSet<>();
        for(int j=i;j<nums.length;j++) {
            if(hs.contains(nums[j])) continue;
            hs.add(nums[j]);
            swap(nums, i, j);
            findPerm(nums, ans, i+1);
            swap(nums, i, j);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1};
        System.out.println(permuteUnique(nums));
    }
}
