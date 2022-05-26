package com.dsa.questions.leetcode;

//Leetcode-229

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {
    //Using extra space
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        for(int i: map.keySet()){
            if(map.get(i) > nums.length/3) ans.add(i);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums =  {3,3};
        System.out.println(majorityElement(nums));
    }
}
