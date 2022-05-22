package com.dsa.hashing;

import java.util.Arrays;
import java.util.HashSet;

//Union - collection of all distinct elements in both the arrays

public class UnionofArray {
    public static int[] union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr1) {
            set.add(i);
        }

        for(int j: arr2) {
            set.add(j);
        }

        int[] ans = new int[set.size()];
        int k = 0;
        for(int i: set) {
            ans[k++] = i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 4, 5, 15, 90, 78, 4};
        int[] arr2 = {4, 5, 15, 10, 4};
        System.out.println(Arrays.toString(union(arr1, arr2)));
    }
}
