package com.dsa.questions.leetcode;

//Leetcode-169

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
//            if(map.containsKey(i))
//                map.replace(i, map.get(i) + 1);
//            else
//                map.put(i, 1);

            map.put(i, map.getOrDefault(i,0) + 1);
            if(map.get(i) > nums.length/2) return i;
        }

        return 0;
    }
    public static void main(String[] args) {
        int[] nums =  {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
