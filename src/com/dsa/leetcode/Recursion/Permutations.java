package com.dsa.leetcode.Recursion;

//Leetcode-46

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
       /* boolean[] freq = new boolean[nums.length];
        findPerm(nums, ans, freq, new ArrayList<>());*/

        findPerm(nums, ans, 0);
        return ans;
    }

//    public static void findPerm(int[] nums, List<List<Integer>> ans, boolean[] freq, List<Integer> curr) {
//        if(curr.size() == nums.length) {
//            ans.add(new ArrayList<>(curr));
//            return;
//        }
//
//        for(int i=0;i< nums.length;i++) {
//            if(!freq[i]) {
//                freq[i] = true;
//                curr.add(nums[i]);
//                findPerm(nums, ans, freq, curr);
//                freq[i] = false;
//                curr.remove(curr.size()-1);
//            }
//        }
//    }

    public static void findPerm(int[] nums, List<List<Integer>> ans, int i) {
        if(i == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for(int n: nums) temp.add(n);
            ans.add(temp);
            return;
        }

        for(int j=i;j<nums.length;j++) {
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
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
}
