package com.dsa.questions.leetcode;

//Leetcode-125

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String str = makeString(s);
        int i = 0, j = str.length()-1;
        while(i <= j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public static String makeString(String str) {
        StringBuilder sbr = new StringBuilder();
        for(char ch: str.toLowerCase().toCharArray()) {
            if(ch >= 'a' && ch <= 'z') sbr.append(ch);
            if(ch >= '0' && ch <= '9') sbr.append(ch);
        }

        return sbr.toString();
    }
}
