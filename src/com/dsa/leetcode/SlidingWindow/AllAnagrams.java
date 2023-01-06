package com.dsa.leetcode.SlidingWindow;

//Leetcode-438

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        int i=0, j=0;
        List<Integer> ans = new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: p.toCharArray()) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        int count = map.size();

        while(j < s.length()) {
            char c1 = s.charAt(j);
            if(map.containsKey(c1)) {
                map.put(c1, map.get(c1)-1);
                if(map.get(c1) == 0) count -= 1;
            }

            if((j-i) + 1 == p.length()) {
                if(count == 0) ans.add(i);
                char c2 = s.charAt(i);
                if(map.containsKey(c2)) {
                    map.put(c2, map.get(c2)+1);
                    if(map.get(c2) == 1) count += 1;
                }
                i++;
            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));
    }
}
