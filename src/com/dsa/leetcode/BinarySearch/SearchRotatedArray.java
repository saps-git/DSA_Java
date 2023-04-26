package com.dsa.leetcode.BinarySearch;

//Leetcode-33

public class SearchRotatedArray {
    //finding pivot, and then searching
    /*public static int searchRotated(int[] nums, int target){
        int pivot = searchPivot(nums);
        if(pivot == -1) return search(nums, target, 0, nums.length-1);
        if(nums[pivot] == target) return pivot;
        if(target >= nums[0]) return search(nums, target, 0, pivot);
        else return search(nums, target, pivot+1, nums.length-1);
    }
    public static int searchPivot(int[] nums){
        int start = 0, end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid < end && nums[mid] > nums[mid+1]) return mid; //pivot will be the only case where this,
            else if(mid > start && nums[mid] < nums[mid-1]) return mid-1; //and this condition will be true
            else if(nums[start] < nums[mid]) start = mid+1; //this means, that nothing in the left hand side of mid is larger,
                // hence pivot lies on the right hand side, hence reducing the search size accordingly
            else end = mid-1;
        }
        return -1;
    }
    public static int search(int[] nums, int target, int start, int end){
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }*/
    public static int searchRotated(int[] nums, int target){
        int start = 0, end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(target == nums[mid]) return mid;
            if(nums[start] <= nums[mid]){ //first we check if start is equal or less than mid,
                // which will imply that left part is sorted
                if(nums[start] <= target && target < nums[mid]) end = mid-1; // then we check if target exists in this part,
                    // and reduce the search space accordingly
                else start = mid+1; //else we will drop the left half and search in the right half
            } else { //do the above mentioned for right half
                if(nums[mid] < target && target <= nums[end]) start = mid+1;
                else end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 3;
        System.out.println(searchRotated(nums, target));
    }
}
