package com.dsa.hashing;

import java.util.HashSet;

public class CountDistinct {
    public static int distinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr) {
            set.add(i);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr = {5,10,15,5,4,5};
        System.out.print(distinct(arr));
    }
}
