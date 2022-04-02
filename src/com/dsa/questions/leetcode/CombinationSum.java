package com.dsa.questions.leetcode;

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
        List<List<Integer>> res = new ArrayList<>();
        helperRecursive(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
    public static void helperRecursive(int[] candidates, int target, int index, List<Integer> ans, List<List<Integer>> res) {
        if(index == candidates.length) return; //if index reached end of array(candidate) ,i.e,
        // no element left to be included or excluded, then return
        if (target == 0) { //if target has become zero (Since we are subtracting element from target while inclusion,
            // At one point target will eventually become 0) we get one set
            res.add(new ArrayList<>(ans));
            return;
        }
        if(target<0) return; //If target has become less than 0, i.e, sum of elements we included till now
        // is greater than target, then return

        //else, target is still greater than 0, continue till we meet either of given condition
        if(candidates[index] <= target) { //we check if the current element is less than target
            ans.add(candidates[index]); // then we include it, and call recursive call
            helperRecursive(candidates, target-candidates[index], index, ans, res);
            ans.remove(ans.size()-1); //while coming back we remove the last element in the list, to check,
            //for other element with the existing combination
        }
        helperRecursive(candidates, target, index+1, ans, res); //if it is larger, we ignore it and call recursive
    }
}
