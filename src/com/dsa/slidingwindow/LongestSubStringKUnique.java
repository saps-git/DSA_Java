package com.dsa.slidingwindow;

import java.util.HashMap;

public class LongestSubStringKUnique {
    public static int longestKSubstring(String s, int k) {
        int i=0, j=0;
        int max = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        while(j < s.length()) {
            char cj = s.charAt(j);
            map.put(cj, map.getOrDefault(cj, 0) + 1);
            if(map.size() == k) {
                max = Integer.max(max, (j-i) + 1);
            }
            else if(map.size() > k) {
                while(map.size() > k) {
                    char ci = s.charAt(i);
                    map.put(ci, map.get(ci)-1);
                    if(map.get(ci) == 0) map.remove(ci);
                    i++;
                }
            }
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestKSubstring(s, k));
    }
}
