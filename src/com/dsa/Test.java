package com.dsa;

import java.util.*;

public class Test {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, ans, new ArrayList<>(), 0, 0);
        return ans;
    }
    public void helper(int[] candidates, int target, List<List<Integer>> ans, List<Integer> curr, int sum, int i) {
        if(i == candidates.length) {
            if(sum == target) {
                System.out.println(curr);
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        sum += candidates[i];
        curr.add(candidates[i]);
        helper(candidates, target, ans, new ArrayList<>(), sum, i+1);

        sum -= candidates[i];
        curr.remove(curr.size()-1);
        helper(candidates, target, ans, new ArrayList<>(), sum, i+1);
    }
    public static void main(String[] args) {
        Test x = new Test();
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(x.combinationSum(candidates, target));
    }
}