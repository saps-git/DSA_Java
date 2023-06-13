package com.dsa;

import static com.dsa.binarysearch.BinarySearchTemplate.binarySearch;
import java.util.*;
public class Test {
    public static List<Integer> distinct(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0, j=0;
        List<Integer> ans = new ArrayList<>();
        while(j < nums.length) {
            int curr = nums[j];
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            if(j-i+1 == k) {
                ans.add(map.size());
                int temp = nums[i];
                map.put(temp, map.get(temp)-1);
                if(map.get(temp) == 0) map.remove(temp);
                i++;
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,3,1,1,3};
        int k = 4; // window size
        System.out.println(distinct(nums, k));
    }
}
