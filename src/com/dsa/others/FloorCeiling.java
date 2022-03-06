package com.dsa.others;

public class FloorCeiling {
    public static int floor(int[] nums, int target, String answer){
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return nums[mid];
            else if(nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return answer == "floor" ? nums[end] : nums[start];
    }
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,15,16,18};
        System.out.println(floor(nums, 14, "floor"));
    }
}
