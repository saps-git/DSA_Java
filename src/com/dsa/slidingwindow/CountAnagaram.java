package com.dsa.slidingwindow;

import java.util.HashMap;

public class CountAnagaram {
//    public static int findAnagrams(String s, String p) {
//        int i = 0, j = 0;
//        int count = 0;
//
//        int[] buffer = new int[26]; //buffer array to check for anagram
//        for(int n=0;n<p.length();n++) {
//            buffer[p.charAt(n) - 'a']++; //updating with chars of "p"
//        }
//
//        while(j < s.length()) {
//            buffer[s.charAt(j) - 'a']--; //making changes with the chars of "s"
//            if((j-i) + 1 == p.length()) { //on hitting the window
//                boolean zero = true; //flag to check if it is an anagram or not
//                for(int x: buffer) { //check if buffer is 0, i.e anagram
//                    if (x != 0) {
//                        zero = false;
//                        break;
//                    }
//                }
//                if(zero) count += 1; //if anagram update count
//                buffer[s.charAt(i) - 'a']++; //remove the last element of the window from the buffer
//                i++;
//            }
//            j++;
//        }
//        return count;
//    }
    public static int findAnagrams(String s, String p) {
        int i=0, j=0, ans=0;

        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : p.toCharArray()) {
            if(map.containsKey(ch)) map.put(ch, map.get(ch)+1);
            else map.put(ch, 1);
        }
        int count = map.size();

        while(j < s.length()) {
            char ch = s.charAt(j);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0) count -= 1;
            }

            if((j-i) + 1 == p.length()) {
                if(count == 0) ans += 1;

                char cr = s.charAt(i);
                if(map.containsKey(cr)) {
                    map.put(cr, map.get(cr)+1);
                    if(map.get(cr) == 1) count += 1;
                }
                i++;
            }
            j++;
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
}
