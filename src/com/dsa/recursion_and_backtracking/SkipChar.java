package com.dsa.recursion_and_backtracking;

public class SkipChar {
    public static void main(String[] args) {
        String str = "baccaad";
        System.out.println(skipChar(str));
    }
    public static String skipChar(String str) {
        if(str.isEmpty()) return "";

        if(str.charAt(0) != 'a') return str.charAt(0) + skipChar(str.substring(1));
        else return "" + skipChar(str.substring(1));
    }
    //using extra var in the argument
    /*public static String skipChar(String str) {
        String ans = "";
        return helper(str, ans);
    }
    public static String helper(String str, String ans) {
        if(str.isEmpty()) return ans;

        if(str.charAt(0) != 'a') ans += str.charAt(0);
        return helper(str.substring(1), ans);
    }*/
}
