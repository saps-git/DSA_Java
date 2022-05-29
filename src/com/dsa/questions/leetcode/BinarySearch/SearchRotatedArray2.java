package com.dsa.questions.leetcode.BinarySearch;

//Leetcode-81

public class SearchRotatedArray2 {
    public static int searchRotated(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;

            else if(nums[start] < nums[mid]){
                if(nums[start] <= target && target < nums[mid]) end = mid-1;
                else start = mid+1;
            } else if(nums[start] > nums[mid]){
                if(nums[mid] < target && target <= nums[end]) start = mid+1;
                else end = mid-1;
            } else {
                //duplicates, we know nums[mid] != target, so nums[start] != target
                //based on current information, we can only move left pointer to skip one cell
                //thus in the worest case, we would have target: 2, and array like 11111111, then
                //the running time would be O(n)
                start++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,9,2,2,2};
        int target = 0;
        System.out.println(searchRotated(nums, target));
    }
}
