package com.dsa.recursion_and_backtracking;

import java.util.ArrayList;

//Return an arraylist of the target elements
public class ReturningArraylist {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        /*ArrayList<Integer> list = new ArrayList<>();
        System.out.println(find(arr, 0, 4, list));*/
        System.out.println(find2(arr,0,4));
    }
    //1st way, creating arraylist in main and passing it as argument
    /*public static ArrayList<Integer> find(int[] arr, int i, int target, ArrayList<Integer> list) {
        if(i == arr.length-1) return list;
        if(arr[i] == target) list.add(i);

        return find(arr, i+1, target, list);
    }*/

    //2nd way, creating arraylist on every function call, and passing it back
    public static ArrayList<Integer> find2(int[] arr, int i, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if(arr[i] == arr.length-1) return list;
        if(arr[i] == target) list.add(i);

        ArrayList<Integer> ans = find2(arr, i+1, target);
        list.addAll(ans);
        return list;
    }
}
