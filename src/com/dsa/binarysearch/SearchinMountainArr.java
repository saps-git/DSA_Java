package com.dsa.binarysearch;

//return index of the target in a mountain array
public class SearchinMountainArr {
    public static int binary(int[] nums, int start, int end, int target) {
        while(start <= end) {
            int mid = start + (end -start)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int mid = 0;
        while(start <= end) {
            mid = start + (end-start)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) break;
            if(nums[mid] > nums[mid+1]) end = mid;
            else start = mid;
        }

        if(nums[mid] == target) return mid;
        int ans = binary(nums, 0, mid, target);
        if(ans != -1) return ans;
        else return binary(nums, mid+1, end, target);
    }
    public static void main(String[] args) {
        int[] nums = {1,3,8,12,5,4,2};
        int target = 4;
        System.out.println(search(nums, target));
    }
}
