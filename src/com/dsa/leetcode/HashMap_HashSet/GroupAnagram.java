package com.dsa.leetcode.HashMap_HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Leetcode-49

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String str: strs) {
            char[] count = new char[26];
            for(char ch: str.toCharArray()) {
                count[ch - 'a']++;
            }
            String s = new String(count);
            List<String> res;
            if(mp.containsKey(s)) {
                res = mp.get(s);
            } else {
                res = new ArrayList<>();
            }
            res.add(str);
            mp.put(s, res);
        }
        return new ArrayList<>(mp.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
