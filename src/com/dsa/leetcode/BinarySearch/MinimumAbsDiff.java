package com.dsa.leetcode.BinarySearch;

//Leetcode-1200

/* Minimum absolute difference between any two elements of the array */
/* Return list of all such pairs */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDiff {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<arr.length;i++) {
            int sol = Math.abs(arr[i] - arr[i-1]);
            if(sol < res) {
                res = sol;
                ans.clear();
                ans.add(Arrays.asList(arr[i-1], arr[i]));
            } else if (sol == res) ans.add(Arrays.asList(arr[i-1], arr[i]));
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {40,11,26,27,-20};
        System.out.println(minimumAbsDifference(arr));
    }
}
