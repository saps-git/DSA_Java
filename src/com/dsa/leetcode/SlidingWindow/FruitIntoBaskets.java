package com.dsa.leetcode.SlidingWindow;

//Leetcode-904

import java.util.HashMap;

public class FruitIntoBaskets {
    public static int totalFruit(int[] fruits) {
        if(fruits.length < 3) return fruits.length;
        int i=0, j=0, ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(j < fruits.length) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0 ) + 1);
            if(map.size() > 2) {
                while(map.size() > 2) {
                    map.put(fruits[i], map.get(fruits[i])-1);
                    if(map.get(fruits[i]) == 0) map.remove(fruits[i]);
                    i++;
                }
            }
            ans = Integer.max(ans, (j-i) + 1);
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] fruits = {1,1};
        System.out.println(totalFruit(fruits));
    }
}
