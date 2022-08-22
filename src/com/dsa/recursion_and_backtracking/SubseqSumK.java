package com.dsa.recursion_and_backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubseqSumK {
    public static void subseqPrint(int[] nums, int target) {
        printSubSeq(nums, target, new ArrayList<>(), 0, 0);
    }

    public static List<List<Integer>> subseqList(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        listSubSeq(nums, target, ans, new ArrayList<>(), 0, 0);
        return ans;
    }

    public static int subseqCount(int[] nums, int target) {
        int count = countSubSeq(nums, target, 0, 0);
        return count;
    }

    public static void subseqAnyOne(int[] nums, int target) {
        anyoneSubSeq(nums, target, new ArrayList<>(), 0, 0);
    }

    public static void printSubSeq(int[] nums, int target, List<Integer> curr, int total, int i) {
        if(i == nums.length) {
            if (total == target) System.out.println(curr);
            return;
        }

        curr.add(nums[i]);
        total += nums[i];
        printSubSeq(nums, target, curr, total, i+1);

        curr.remove(curr.size()-1);
        total -= nums[i];
        printSubSeq(nums, target, curr, total, i+1);
    }

    public static void listSubSeq(int[] nums, int target, List<List<Integer>> ans, List<Integer> curr, int total, int i){
        if(i == nums.length) {
            if (total == target) ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        total += nums[i];
        listSubSeq(nums, target, ans, curr, total, i+1);

        curr.remove(curr.size()-1);
        total -= nums[i];
        listSubSeq(nums, target, ans, curr, total, i+1);
    }

    public static int countSubSeq(int[] nums, int target, int total, int i) {
        if(i == nums.length) {
            if (total == target) return 1;
            return 0;
        }

        total += nums[i];
        int l = countSubSeq(nums, target, total, i+1);

        total -= nums[i];
        int r = countSubSeq(nums, target, total, i+1);

        return l + r;
    }

    public static boolean anyoneSubSeq(int[] nums, int target, List<Integer> curr, int total, int i) {
        if(i == nums.length) {
            if (total == target) {
                System.out.println(curr);
                return true;
            }
            return false;
        }

        curr.add(nums[i]);
        total += nums[i];
        if(anyoneSubSeq(nums, target, curr, total, i + 1)) return true;

        curr.remove(curr.size() - 1);
        total -= nums[i];
        if(anyoneSubSeq(nums, target, curr, total, i + 1)) return true;

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target = 3;
        subseqPrint(nums, target);
        System.out.println("-----------");
        System.out.println(subseqList(nums, target));
        System.out.println("-----------");
        System.out.println(subseqCount(nums, target));
        System.out.println("-----------");
        subseqAnyOne(nums, target);
    }
}
