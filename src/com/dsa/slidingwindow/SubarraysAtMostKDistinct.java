package com.dsa.slidingwindow;

import java.util.HashMap;

public class SubarraysAtMostKDistinct {
    public static int kDistinctSubarrays(int nums[], int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0, j=0;
        int count = 0;
        while(j < nums.length) {
            int curr = nums[j];
            map.put(curr, map.getOrDefault(curr, 0) + 1);

            if(map.size() > k) {
                while(map.size() > k) {
                    int temp = nums[i];
                    map.put(temp, map.get(temp)-1);
                    if(map.get(temp) == 0) map.remove(temp);
                    i++;
                }
            }

            count += j-i+1;
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3};
        int k = 2;
        System.out.println(kDistinctSubarrays(nums, k));
    }
}
