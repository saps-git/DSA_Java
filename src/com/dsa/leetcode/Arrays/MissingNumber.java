package com.dsa.leetcode.Arrays;

//Leetcode-268

public class MissingNumber {
    //you can sort the array, and then look for the number, but it'll take O(n*logn) time
//    void swap(int[] nums, int x, int y) {
//        int temp = nums[x];
//        nums[x] = nums[y];
//        nums[y] = temp;
//    }
//    int missingNumber(int[] nums) {
//        int i=0;
//        while(i < nums.length) {
//            int correctPos = nums[i];
//            if(correctPos < nums.length && nums[correctPos] != nums[i]) swap(nums, i, correctPos);
//            else i++;
//        }
//
//        for(int j=0;j<nums.length;j++){
//            if(nums[j] != j) {
//                return j;
//            }
//        }
//
//        return nums.length;
//    }

    //better approach is to just find the total that should have been, and keep on subtracting all the elements,
    //you'll be left with the answer at last.
    int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n+1)/2; //formula to calculate the total sum of 1 to n
        for(int i: nums) {
            sum -= i;
        }

        return sum;
    }

    //NOTE: if the sum is too big, then we can use XOR solution, look it up
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,0,9,7,8,3};
        MissingNumber mn = new MissingNumber();
        System.out.println(mn.missingNumber(nums));
    }
}
