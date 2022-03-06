package com.dsa.questions.leetcode;

//Leetcode-34

import java.util.Arrays;

//Noobway O(n)

//    public static int[] searchRange(int[] nums, int target) {
//        int[] ans = {-1, -1};
//        for(int i=0;i<nums.length;i++){
//            if(nums[i] != target) continue;
//            else if(ans[0] == -1) ans[0] = i;
//            else ans[1] = i;
//        }
//        return ans;
//    }

//Proway O(log n)
public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1) //only run the second one, when we find ans[0], i.e the number exists atleast once
            ans[1] = search(nums, target, false);

        return ans;
    }

    public static int search(int[] nums, int target, boolean isFirst){
        int res = -1;
        int start = 0, end = nums.length;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]) end = mid-1;
            else if(target > nums[mid]) start = mid+1;
            else {
                res = mid;
                if(isFirst) end = mid-1;
                else start = mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
