package com.dsa.leetcode.Recursion;

//Leetcode-216

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(k, n, ans, new ArrayList<>(), 1);
        return ans;
    }
    public static void findCombinations(int k, int n, List<List<Integer>> ans, List<Integer> curr, int i) {
        if(k == 0) {
            if (n == 0) ans.add(new ArrayList<>(curr));
            return;
        }

        if(i == 10) return;
        if(n < 0) return;

        curr.add(i);
        findCombinations(k-1, n-i, ans, curr, i+1);
        curr.remove(curr.size() - 1);
        findCombinations(k, n, ans, curr, i+1);
    }
    public static void main(String[] args) {
        int k = 9 , n = 45;
        System.out.println(combinationSum3(k, n));
    }
}
