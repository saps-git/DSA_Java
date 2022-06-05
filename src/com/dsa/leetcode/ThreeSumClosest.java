package com.dsa.leetcode;

//Leetcode-16

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++) {
            int low = i+1, high = nums.length-1;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(Math.abs(target - sum) < Math.abs(target - ans)) {
                    ans = sum;
                }
                if (sum > target) high--;
                else low++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
