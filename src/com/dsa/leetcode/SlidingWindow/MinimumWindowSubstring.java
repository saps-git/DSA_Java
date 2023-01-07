package com.dsa.leetcode.SlidingWindow;

//Leetcode-76

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        int i=0, j=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = map.size();
        int minLen = Integer.MAX_VALUE;
        int start = 0, end = 0;
        while(j < s.length()) {
            char ch = s.charAt(j);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0) count -= 1;
            }
            if(count == 0) {
                while(count == 0) {
                    if(minLen > (j-i) + 1) {
                        minLen = (j-i) + 1;
                        start = i;
                        end = j;
                    }
                    char ci = s.charAt(i);
                    if(map.containsKey(ci)) {
                        map.put(ci, map.get(ci) + 1);
                        if(map.get(ci) > 0) count += 1;
                    }
                    i++;
                }
            }
            j++;
        }
        return minLen > s.length() ? "" : s.substring(start, end+1);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t));
    }
}
