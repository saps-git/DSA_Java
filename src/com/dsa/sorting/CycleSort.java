package com.dsa.sorting;

import java.util.Arrays;

//Every number's sorted position would be number-1, example 5 will be at pos 4.
//So we compare if the number is at it's sorted position, if not we sort it.
//This sort is mostly used in different types of questions in interview, when there is '1 to n' mentioned in the questions
//O(n)
public class CycleSort {
    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {5,2,3,1,4};
        int i = 0;
        while(i < nums.length) {
            int correctIdx = nums[i]-1;
            if(nums[correctIdx] != nums[i]) swap(nums, i, correctIdx);
            else i++;
        }

        System.out.println(Arrays.toString(nums));
    }
}
