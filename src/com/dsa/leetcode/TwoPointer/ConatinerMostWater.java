package com.dsa.leetcode.TwoPointer;

//Leetcode-11

public class ConatinerMostWater {
    public static int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int ans = 0;
        while(i < j) {
            int area = (j-i) * Integer.min(height[i], height[j]);
            ans = Integer.max(ans, area);
            if(height[i] > height[j]) j--;
            else if(height[i] < height[j]) i++;
            else {
                i++;
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
