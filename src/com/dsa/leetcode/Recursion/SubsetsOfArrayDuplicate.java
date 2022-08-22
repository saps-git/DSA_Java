package com.dsa.leetcode.Recursion;

//Leetcode-90

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubsetsOfArrayDuplicate {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

       /* HashSet<List<Integer>> hs = new HashSet<>();
        printSet(nums, hs, new ArrayList<>(), 0);
        List<List<Integer>> ans = new ArrayList<>(hs);*/

        List<List<Integer>> ans = new ArrayList<>();
        printSet(nums, ans, new ArrayList<>(), 0);

        return ans;
    }
    //Noobway, using extra space, i.e Hashset
    /*public static void printSet(int[] nums, HashSet<List<Integer>> hs, List<Integer> curr, int i) {
        if(i == nums.length) {
            hs.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        printSet(nums, hs, curr, i+1);
        curr.remove(curr.size() - 1);
        printSet(nums, hs, curr, i+1);
    }*/

    //Proway, ignoring all the elements that are same as previous
    public static void printSet(int[] nums, List<List<Integer>> ans, List<Integer> curr, int i) {
        if(i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        printSet(nums, ans, curr, i+1);
        curr.remove(curr.size() - 1);

        while(i+1 < nums.length && nums[i] == nums[i+1]) i++;
        printSet(nums, ans, curr, i+1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}
