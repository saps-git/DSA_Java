package com.dsa.leetcode;

// Leetcode-1

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int sum = target - nums[i];
            if(map.containsKey(sum)){
                ans[0] = map.get(sum);
                ans[1] = i;
                break;
            }
            else
                map.put(nums[i], i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,15,11,7};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
