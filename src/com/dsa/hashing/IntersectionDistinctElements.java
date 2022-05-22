package com.dsa.hashing;

import java.util.Arrays;
import java.util.HashSet;

//Intersection - Elements common in both the arrays
// * only distinct elements, i.e no duplicates

public class IntersectionDistinctElements {
    public static int[] intersection(int[] arr1, int arr2[]){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i: arr1) {
            set1.add(i);
        }
        for(int i: arr2) {
            if(set1.contains(i)) {
                set2.add(i);
            }
        }

        int[] ans = new int[set2.size()];
        int i=0;
        for(int num: set2) {
            ans[i++] = num;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 4, 5, 15, 90, 5};
        int[] arr2 = {4, 5, 25, 10, 5};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
}
