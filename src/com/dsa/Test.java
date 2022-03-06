package com.dsa;

import java.util.Arrays;

public class Test {
    public static int[] searchRange(int[] nums, int target){
        int[] ans = {-1, 1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1) ans[1] = search(nums, target, false);
        return ans;
    }
    public static int search(int[] nums, int target, boolean isFirst){
        int res = -1;
        int start = 0, end = nums.length-1;
        while(start < end) {
            int mid = start + (end - start)/2;
            if(nums[mid] > target) start = mid+1;
            else if(nums[mid] < target) end = mid-1;
            else{
                res = mid;
                if(isFirst) end = mid-1;
                else start = mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,9,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
