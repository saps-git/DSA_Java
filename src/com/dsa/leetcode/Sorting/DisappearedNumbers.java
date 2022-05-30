package com.dsa.leetcode.Sorting;

//Leetcode-448

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correctIdx = nums[i]-1;
            if(nums[correctIdx] != nums[i]) swap(nums, i, correctIdx);
            else i++;
        }

        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1) ans.add(j+1);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
