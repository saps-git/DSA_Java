package com.dsa.others;

//When you don't know if it is ascending or descending sorted.

public class OrderAgnostincBS {

    public static int binarySearch(int[] nums, int target){
        int start = 0, end = nums.length-1;
        boolean isAsc = nums[start] < nums[end]; //checking if it is Ascending or Descending

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;

            if(isAsc){
                if(nums[mid] < target) start = mid+1;
                else end = mid-1;
            }
            else{
                if(nums[mid] < target) end = mid-1;
                else start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 10;
        System.out.println(binarySearch(nums, target));
    }
}
