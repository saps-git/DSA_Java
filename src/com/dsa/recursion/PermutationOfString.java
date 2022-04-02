package com.dsa.recursion;

//Much like power-set question
//On every recursive call, we make as many subsequent recursive calls as,
// there are places to be filled in the answer string(ans) by the current element of the given string(str)
// in which, we add an element from given string(str), to all the possible positions in the answer string(ans),
// finally when the given string is empty(i == str.length()), we print the answer string,
// as it now contains a valid permutation.

import java.util.ArrayList;

public class PermutationOfString {
    public static void main(String[] args) {
        String str = "abc";
        permutations(str, "", 0);
        //System.out.println(permutations2(str, "", 0));
    }
    public static void permutations(String str, String ans, int index) {
        if(index == str.length()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(index);
        for(int i=0;i<=ans.length();i++) { //there will always be n+1 places to be filled if there are n elements already
            String firstHalf = ans.substring(0, i); //we will take two halves, first
            String secondHalf = ans.substring(i, ans.length()); // and second
            permutations(str, firstHalf+ch+secondHalf, index+1); //and then add the char in b/w
        }
    }
    /*public static ArrayList<String> permutations2(String str, String ans, int index) {
        if(index == str.length()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(ans);
            return res;
        }

        char ch = str.charAt(index);
        ArrayList<String> sol = new ArrayList<>(); //Local to this call(first call)

        for(int i=0;i<=ans.length();i++) {
            String firstHalf = ans.substring(0, i);
            String secondHalf = ans.substring(i, ans.length());
            sol.addAll(permutations2(str, firstHalf+ch+secondHalf, index+1));
        }

        return sol;
    }*/
}
