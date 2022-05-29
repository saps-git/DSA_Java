package com.dsa.questions.leetcode.Recursion;

//Leetcode-1823

import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public static int josephus(List<Integer> arr, int n, int k, int index){
        if(arr.size() == 1)
            return arr.get(0);

        index = (index + k)%n;
        arr.remove(index);
        return josephus(arr, n-1, k, index);
    }

    public static void main(String[] args) {
        int k = 2;
        int n = 5;
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++)
            arr.add(i+1);

        System.out.println(josephus(arr, n, k-1, 0));
    }
}
