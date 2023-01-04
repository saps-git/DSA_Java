package com.dsa.leetcode.BinarySearch;

//Leetcode - 875

public class KoKoBananas {
    //For Leetcode there are long values and weird conditions. Hence we need to make it to long.
    //But in general cases we can use int everywhere
    public static boolean isPossible(int[] piles, int h, long mid) {
        int time = 0;
        for (int i : piles) {
           time +=  (int)Math.ceil((double)i/mid); //as for 7/3 we'll get 2, but we want the decimal value hence we
            // convert it to double, so it becomes 2.3 so that we can convert it to 3 by using Math.ceil,
            // and then convert the whole to int. So that we'll get the complete hour.
        }
        return time <= h;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        long min = 0, max = Integer.MIN_VALUE; //can use int values here
        for(int i: piles) {
            max = Long.max(max, i);
            min += i;
        }

        if(min >= h) min /= h; //no need for the check, can directly do the division

        long ans = Long.MAX_VALUE; //use int values
        while(min <= max) {
            long mid = min + (max-min)/2; //use int value
            if(isPossible(piles, h, mid)) {
                ans = mid;
                max = mid-1;
            } else {
                min = mid+1;
            }
        }
        return (int)ans; //since above we'll use int, no need to convert it back to int
    }
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6;
        System.out.println(minEatingSpeed(piles, h));
    }
}
