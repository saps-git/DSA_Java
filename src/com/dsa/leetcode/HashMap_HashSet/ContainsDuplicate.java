package com.dsa.leetcode.HashMap_HashSet;

//Leetcode-217

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    //Using Hashmap
//    public static boolean containsDuplicate(int[] nums) {
//        HashMap<Integer, Integer> mp = new HashMap<>();
//        for(int i: nums) {
//            if(mp.containsKey(i)) {
//                int val = mp.get(i);
//                mp.put(i, val+1);
//            } else {
//                mp.put(i, 1);
//            }
//        }
//
//        for(int i: mp.keySet()){
//            int ans = mp.get(i);
//            if(ans > 1) return true;
//        }
//
//        return false;
//    }

    //We can use HashSet which will be even more faster and in one go
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums) {
            if(set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }

}
