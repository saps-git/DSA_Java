package com.dsa.leetcode.SlidingWindow;

//Leetcode-992

import java.util.HashMap;

public class SubarrayKDifferentInt {
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return kDistinctSubarrays(nums, k) - kDistinctSubarrays(nums, k-1);
    }
    public static int kDistinctSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0, j=0;
        int count = 0;
        while(j < nums.length) {
            int elJ = nums[j];
            map.put(elJ, map.getOrDefault(elJ, 0) + 1);

            while(map.size() > k) {
                int elI = nums[i];
                map.put(elI, map.get(elI)-1);
                if(map.get(elI) == 0) map.remove(elI);
                i++;
            }

            count += j-i+1;
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3};
        int k = 2;
        System.out.println(subarraysWithKDistinct(nums, k));
    }
}
