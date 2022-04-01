package com.dsa.recursion;

//On every recursive call, we make two subsequent recursive calls,
// one in which, we add an element from given string(str), to the answer string(ans),
// second in which, we do NOT add an element from given string(str), to the answer string(ans),
// finally when the given string is empty(i == str.length()), we print the answer string,
// as it now contains a valid subsequence.

import java.util.ArrayList;
import java.util.Arrays;

//O(2^n)
public class PowerSetOfString {
    public static void main(String[] args) {
        subSeq("", "abc", 0);
        //System.out.println(subSeq2("", "abc", 0));
    }
    //simply printing the subseq
    public static void subSeq(String ans, String str, int i) {
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }

        subSeq(ans + str.charAt(i), str, i+1);
        subSeq(ans, str, i+1);
    }
    //returning an arraylist
    /*public static ArrayList<String> subSeq2(String ans, String str, int i) {
        if(i == str.length()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(ans);
            return res;
        }

        ArrayList<String> adding = subSeq2(ans+str.charAt(i), str, i+1);
        ArrayList<String> notAdding = subSeq2(ans, str, i+1);
        adding.addAll(notAdding);
        return adding;
    }*/
}
