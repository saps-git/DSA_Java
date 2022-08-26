package com.dsa.recursion_and_backtracking;

public class PermutationOfString {
    public static void permutations(String str, int i) {
        if(i == str.length()) {
            System.out.println(str);
            return;
        }

        for(int j=i;j<str.length();j++) {
            str = swap(str, i, j);
            permutations(str, i+1);
            str = swap(str, i, j);
        }
    }

    public static String swap(String str, int i, int j) {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "abc";
        permutations(str, 0);
    }
}
