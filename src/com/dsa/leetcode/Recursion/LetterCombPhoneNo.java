package com.dsa.leetcode.Recursion;

//leetcode-17

//O(3^n)
import java.util.ArrayList;
import java.util.List;

public class LetterCombPhoneNo {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0) return res;

        String[] mapping = { //create a mapping, as it will help solve it more efficiently
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

        recursiveHelper(digits, "", 0, res, mapping);
        return res;
    }
    public static void recursiveHelper(String digits, String ans, int index, List<String> res, String[] mapping) {
        if(index == digits.length()) {
            res.add(ans);
            return;
        }

        String letter = mapping[digits.charAt(index) - '0']; //will take out the string according to the number passed
        //in the digit, i.e for 2 in "23", it'll add "abc" to letter
        for(int i=0;i<letter.length();i++) {//i.e first for "a" in (2 = "abc") with all chars in (3="def"),
            // then "b" with all chars in (3="def") and so on for as many chars in digit string ("23").
            recursiveHelper(digits, ans+letter.charAt(i), index+1, res, mapping);
        }
    }
}
