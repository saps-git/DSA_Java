package com.dsa.recursion;

public class SkipWord {
    public static void main(String[] args) {
        String str = "bacapplecdah";
        System.out.println(skipWord(str));
    }
    public static String skipWord(String str) {
        if(str.isEmpty()) return "";

        if(str.startsWith("apple")) return  "" + skipWord(str.substring("apple".length()));
        else return str.charAt(0) + skipWord(str.substring(1));
    }
}
