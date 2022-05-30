package com.dsa.leetcode;

//Leetcode-15

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(nums.length <= 2)
            return ans;

        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i == 0 || (i>0 && nums[i] != nums[i-1])){
                int target = 0-nums[i];
                int low = i+1;
                int high = nums.length-1;
                while(low < high){
                    if(nums[low]+nums[high] == target){
                        ans.add((Arrays.asList(nums[i], nums[low], nums[high])));
                        while(low < high && nums[low] == nums[low+1]) low++;
                        while(low < high && nums[high] == nums[high-1]) high--;

                        low++;
                        high--;
                    }
                    else if(nums[low]+nums[high] < target)
                        low++;
                    else
                        high--;
                }
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,4};
        List<List<Integer> > ans = threeSum(nums);
        System.out.println(ans);
    }
}


