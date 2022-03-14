package com.dsa.questions.leetcode;

//Leetcode-645
import java.util.Arrays;

public class SetMismatch {
    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correctIdx = nums[i]-1;
            if(nums[correctIdx] != nums[i]) swap(nums, i, correctIdx);
            else i++;
        }

        for(int j=0;j<nums.length;j++) {
            if(nums[j] != j+1) return new int[] {nums[j], j+1};
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
