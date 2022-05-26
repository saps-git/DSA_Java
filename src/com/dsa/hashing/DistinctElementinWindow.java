package com.dsa.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//counting distinct elements in each window

public class DistinctElementinWindow {
    public static List<Integer> distinct(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        ans.add(map.size());

        for(int i=k;i<nums.length;i++) {
            if(map.get(nums[i-k]) == 1) {
                map.remove(nums[i-k]);
            } else {
                map.put(nums[i-k], map.get(nums[i-k])-1);
            }
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            ans.add(map.size());
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,3,1,1,3};
        int k = 4; // window size
        System.out.println(distinct(nums, k));
    }
}
