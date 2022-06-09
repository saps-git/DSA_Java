package com.dsa.leetcode.BinarySearch;

//Leetcode-1552

import java.util.Arrays;

public class MagneticForce2balls {
    public static boolean isPossible(int[] position, int m, int dist) {
        int lastBall = position[0];
        m--;
        for(int i=1;i<position.length;i++) {
            if(position[i] - lastBall >= dist) {
                m--;
                if(m == 0) return true;
                lastBall = position[i];
            }
        }

        return false;
    }

    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1] - position[0];
        int ans = 1;

        while(low <= high) {
            int mid = low + (high-low)/2;
            if(isPossible(position, m, mid)) {
                ans = Integer.max(ans, mid);
                low = mid+1;
            } else high = mid-1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] position = {1,2,3,4,7};
        int m = 3;
        System.out.println(maxDistance(position, m));
    }
}
