package com.dsa.sorting;

import java.util.Arrays;

//Take a pivot element and put all the elements less than it on it's left, and all the elements more than it on it's right
//Now the pivot is at it's sorted place,
//Now repeat the process on the two arrays(imagine the numbers on either sides of the pivot as arrays) on either side of
//the pivot.
//O(n*logn), inplace
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int start = left;
        int end = right;
        int pivot = nums[start + (end - start) / 2];

        while (start <= end) {
            //finding an element larger(from start) and smaller(from end) than the pivot, and then swap them
            while (nums[start] < pivot) start++;
            while (nums[end] > pivot) end--;

            // checking for this condition, also a reason why if its already sorted it will not swap
            if (left <= right) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // now my pivot is at correct index, sort two halves now
        quickSort(nums, left, end);
        quickSort(nums, start, right);
    }
}
