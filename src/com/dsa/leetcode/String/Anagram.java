package com.dsa.leetcode.String;

//Leetcode-242

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] buffer = new int[26];
        for(int i=0;i<=s.length()-1;i++) {
            buffer[s.charAt(i) - 'a']++;
            buffer[t.charAt(i) - 'a']--;
        }

        for(int i: buffer) {
            if(i != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
