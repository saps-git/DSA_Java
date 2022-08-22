package com.dsa.leetcode.Recursion;

//leetcode-39

import java.util.ArrayList;
import java.util.List;

//Include element(candidate[i]) at current index(i) = combinations(candidate, index, target-candidate[i], ans, res);
    //Substract it from target = (target-candidate[i])
    //Do not increment index as we can use same element for any number of times

//Exclude element at current index = combinations(candidate, index+1, target, ans, res);
    //Do not subtract it from target coz we have excluded it
    //Increment index as we have to exclude current index, thus increment to next element.

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;

        System.out.println(combinationSum(candidates, target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
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

        if(candidates[i] <= target) {
            curr.add(candidates[i]);
            findCombinations(candidates, target-candidates[i], ans, curr, i);
            curr.remove(curr.size() - 1);
        }
        findCombinations(candidates, target, ans, curr, i+1);
    }
}
