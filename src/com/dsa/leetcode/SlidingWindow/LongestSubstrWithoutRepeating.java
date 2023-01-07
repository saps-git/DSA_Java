package com.dsa.leetcode.SlidingWindow;

//Leetcode-3

import java.util.HashSet;

public class LongestSubstrWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        int i=0, j=0;
        int ans = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        while(j < s.length()) {
            char ch = s.charAt(j);
            if(set.contains(ch)) {
                while (set.contains(ch)) {
                    set.remove(s.charAt(i));
                    i++;
                }
            }
            set.add(ch);
            ans = Integer.max(ans, (j-i) + 1);
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
