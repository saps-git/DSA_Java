package com.dsa.questions.leetcode.HashMap_HashSet;

//Leetcode-350

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionofArray2 {
    public static int[] intersect(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i: arr1) {
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for(int i: arr2) {
            if(map.containsKey(i) && map.get(i) != 0) {
                temp.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        int[] ans = new int[temp.size()];
        int k = 0;
        for(int i: temp) {
            ans[k++] = i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 4, 5, 15, 90, 5, 10};
        int[] arr2 = {4, 5, 25, 10, 5};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }
}
