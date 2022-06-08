package com.dsa.leetcode.BinarySearch;

//Leetcode-1011

public class ShippingPackage {
    private static boolean shipped(int[] weights, int days, int mid) {
        int sum = 0, time = 1;
        for(int i: weights) {
            if(sum + i > mid) {
                time++;
                sum = i;
            } else sum += i;
        }

        return time <= days;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for(int i: weights) {
            low = Integer.max(low, i);
            high += i;
        }

        int res = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(shipped(weights, days, mid)) {
                res = mid;
                high = mid-1;
            } else low = mid+1;
        }

        return res;
    }


    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
}
