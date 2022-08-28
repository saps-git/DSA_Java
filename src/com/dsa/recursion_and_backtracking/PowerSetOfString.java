package com.dsa.recursion_and_backtracking;

import java.util.ArrayList;
import java.util.List;

//PowerSet - all subsequences
//O(2^n)
public class PowerSetOfString {
    public static List<String> subSeq(String str) {
        List<String> ans = new ArrayList<>();
        findSeq(str, ans, new StringBuilder(), 0);
        return ans;
    }
    public static void findSeq(String str, List<String> ans, StringBuilder curr, int i) {
        if(i == str.length()) {
            ans.add(new String(curr));
            return;
        }

        curr.append(str.charAt(i));
        findSeq(str, ans, curr, i+1);

        curr.deleteCharAt(curr.length()-1);
        findSeq(str, ans, curr, i+1);

    }
    public static void main(String[] args) {
        System.out.println(subSeq("abc"));
    }
}
