package com.dsa.questions.leetcode.String;

//Leetcode-917

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
        int i = 0, j = s.length()-1;
        char[] sChar = s.toCharArray();
        while(i < j) {
            if(!Character.isLetter(sChar[i])) i++;
            if(!Character.isLetter(sChar[j])) j--;
            if(Character.isLetter(sChar[i]) && Character.isLetter(sChar[j])) {
                char c = sChar[i];
                sChar[i] = sChar[j];
                sChar[j] = c;
                i++; j--;
            }
        }
        return new String(sChar);
    }

    public static void main(String[] args) {
        String s = "z<*zj";
        System.out.println(reverseOnlyLetters(s));
    }

}
