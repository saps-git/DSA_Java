package com.dsa.leetcode.Recursion;

//leetcode-17

//O(3^n)
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombPhoneNo {
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        findCombs(digits, ans, map, new StringBuilder(), 0);
        return ans;
    }
    public static void findCombs(String digits, List<String> ans, HashMap<Character, String> map, StringBuilder curr, int i) {
        if(i == digits.length()) {
            ans.add(new String(curr));
            return;
        }

        char ch = digits.charAt(i);
        String s = map.get(ch);
        for(int j=0;j<s.length();j++) {
            char c = s.charAt(j);
            curr.append(c);
            findCombs(digits, ans, map, curr, i+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
