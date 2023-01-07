package com.dsa.leetcode.HashMap_HashSet;

//Leetcode-560

import java.util.HashMap;

public class SubarraySumK {
    public static int subarraySum(int[] nums, int k) {
        int sum = 0, ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            sum += num;
            int rem = sum - k;
            if (map.containsKey(rem)) {
                ans += map.get(rem);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(subarraySum(nums, k));
    }
}
