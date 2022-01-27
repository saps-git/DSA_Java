package com.dsa.questions.leetcode;

//Leetcode-387

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public static int firstUniqChar(String s){
        if(s == null || s.isEmpty())
            return -1;

        Map<Character, Integer> mp = new HashMap<>();
        for(char c: s.toCharArray()){
            if(mp.containsKey(c))
                mp.put(c, mp.get(c)+1);
            else
                mp.put(c, 1);
        }

        for(char c: s.toCharArray()){
            if(mp.get(c) == 1)
                return s.indexOf(c);
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "aaabcccdeeef";
        System.out.println(firstUniqChar(str));
    }
}
