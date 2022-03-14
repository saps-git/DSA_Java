package com.dsa.questions.leetcode;

//Leetcode-268

public class MissingNumber {
    void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    int missingNumber(int[] nums) {
        int i=0;
        while(i < nums.length) {
            int correctPos = nums[i];
            if(correctPos < nums.length && nums[correctPos] != nums[i]) swap(nums, i, correctPos);
            else i++;
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j] != j) {
                return j;
            }
        }

        return nums.length;
    }
    public static void main(String[] args) {
        int[] nums = {1,6,4,2,0,9,7,8,3};
        MissingNumber mn = new MissingNumber();
        System.out.println(mn.missingNumber(nums));
    }
}
