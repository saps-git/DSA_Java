package com.dsa.recursion;

public class ReverseString {
    public static String reverseString(String str){
        if(str.equals("")) return "";

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args){
        String str = "Bonjour";
        System.out.println(reverseString(str));
    }
}