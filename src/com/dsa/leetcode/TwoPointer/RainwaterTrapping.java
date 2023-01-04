package com.dsa.leetcode.TwoPointer;

//Leetcode-42

public class RainwaterTrapping {
    //we take two arrays, one to store the max height on left(prefix max), and one for right(suffix max)
    //then compare both of them, and take the min one, from which we subtract height[i] to find the
    //amount of water that can be stored at a particular height
    //O(n) time but O(2n) space
//    public static int trap(int[] height) {
//        int[] left = new int[height.length];
//        int[] right = new int[height.length];
//
//        left[0] = height[0];
//        for(int i=1;i<left.length;i++) {
//            left[i] = Math.max(left[i-1], height[i]);
//        }
//
//        right[height.length-1] = height[height.length-1];
//        for(int i=right.length-2;i>=0;i--) {
//            right[i] = Math.max(right[i+1], height[i]);
//        }
//
//        int ans = 0;
//        for(int i=0;i<height.length;i++) {
//            ans += Math.min(left[i], right[i]) - height[i];
//        }
//
//        return ans;
//    }

    //here we will use two pointer, and will keep track of the left and right maximums, and then check
    //which ever is minimum to add that much water only
    //O(n) time with constant space
    public static int trap(int[] height) {
        int n = height.length;
        int l = 0, r = n-1;
        int maxLeft = 0, maxRight = 0;
        int ans = 0;
        while(l <= r) {
            if(height[l] <= height[r]) {
                if(height[l] >= maxLeft) maxLeft = height[l];
                else ans += maxLeft - height[l];

                l++;
            } else {
                if(height[r] >= maxRight) maxRight = height[r];
                else ans += maxRight - height[r];

                r--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
