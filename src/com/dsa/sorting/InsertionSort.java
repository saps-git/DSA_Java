package com.dsa.sorting;

//On each cycle, put element from unsorted to sorted part, that is b/w 'i to 0'
//O(n^2) Stable sorting algo

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {13,45,2,6,78,10};
        for(int i=1;i<nums.length;i++){
            int temp = nums[i]; //curr no. to be put in sorted part of the array
            int j = i-1;
            while(j >= 0 && nums[j] > temp) { //compare till you find an element NOT greater than curr(temp),
                // since all the elements before that are sorted.
                nums[j+1] = nums[j]; // shift all the element to right
                j--;
            }
            nums[j+1] = temp; //at the point where it breaks, add the temp
        }

        for(int i: nums) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
