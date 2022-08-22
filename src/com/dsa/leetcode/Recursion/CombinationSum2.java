package com.dsa.leetcode.Recursion;

//Leetcode-40
//No duplicates, i.e elements should be present only once in the o/p list

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(candidates, target, ans, new ArrayList<>(), 0);
        return ans;
    }
    public static void findCombinations(int[] candidates, int target, List<List<Integer>> ans, List<Integer> curr, int i) {
        if(target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0) return;

        if(i == candidates.length) return;

        curr.add(candidates[i]);
        findCombinations(candidates, target-candidates[i], ans, curr, i+1);
        curr.remove(curr.size()-1);

        while(i+1 < candidates.length && candidates[i] == candidates[i+1]) i++;
        findCombinations(candidates, target, ans, curr, i+1);
    }
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;

        System.out.println(combinationSum2(candidates, target));
    }
}
