package com.dsa.binarysearch;

import java.util.Arrays;

public class AggresiveCows {
    //Brute force, time-O(n*m) where n=stalls.length, m=cows
    /*
        After sorting the array, we set a minimum distance, then we keep on increasing until accommodation of
        all cows is not possible. We stop just before that to get our answer, which in this example is 3.

        For checking if the cows can fit or not, we are simply iterating over our n stalls, and for every stall
        with the said minimum distance, we place our cow. After we are done, if all cows have been accommodated,
        we return true, otherwise false.
     */
    /*public static int aggresive(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int maxD = stalls[stalls.length-1] - stalls[0];
        int ans = Integer.MIN_VALUE;
        for(int i=1;i<=maxD;i++) {
            if(possible(stalls, cows, i)) {
                ans = Integer.max(ans, i);
            }
        }

        return ans;
    }*/
    public static boolean possible(int[] stalls, int cows, int dist) {
        int lastStall = stalls[0];
        cows--;
        for(int i=1;i<stalls.length;i++) {
            if(stalls[i] - lastStall >= dist) {
                cows--;
                if(cows == 0) return true;
                lastStall = stalls[i];
            }
        }

        return false;
    }
    public static int aggresive(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int low = 1, high = stalls[stalls.length-1] - stalls[0];
        int ans = 1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(possible(stalls, cows, mid)) {
                ans = Math.max(ans, mid);
                low = mid+1;
            } else high = mid-1;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] stalls = {1,2,8,4,9};
        int cows = 3;
        System.out.println(aggresive(stalls, cows));
    }
}
