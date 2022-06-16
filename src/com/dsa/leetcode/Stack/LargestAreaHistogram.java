package com.dsa.leetcode.Stack;

//Leetcode-84

import java.util.Stack;

public class LargestAreaHistogram {
    //Noobway, for every element checking how far can they can expand on either sides and then adding the total up and
    //Time - O(n2)
    /*public static int largestRectangleArea(int[] heights) {
        int ans = 0;
        for(int i=0;i<heights.length;i++) {
            int left = i, right = i;
            while(left >= 0 && heights[left] >= heights[i]) {
                left--;
            }
            while(right < heights.length && heights[right] >= heights[i]) {
                right++;
            }

            int sol = (right - left - 1) * heights[i];
            ans = Math.max(ans, sol);
        }
        return ans;
    }*/

    //Proway - Time - O(n), Space - O(n)
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int ans = 0;
        int[] left = smallerLeft(heights, n);
        int[] right = smallerRight(heights, n);
        for(int i=0;i<heights.length;i++) {
            int area = heights[i] * (right[i] - left[i] - 1);
            ans = Math.max(ans, area);
        }
        return ans;
    }
    public static int[] smallerLeft(int[] heights, int n) {
        Stack<Integer> st = new Stack<>();
        int[] left = new int[n];
        int i = 0;
        while(i < n) {
            while(!st.empty() && heights[i] <= heights[st.peek()]) st.pop();
            if(st.empty()) left[i] = -1;
            else left[i] = st.peek();
            st.push(i);
            i++;
        }
        return left;
    }
    public static int[] smallerRight(int[] heights, int n) {
        Stack<Integer> st = new Stack<>();
        int[] right = new int[n];
        int i = n-1;
        while(i >= 0) {
            while(!st.empty() && heights[i] <= heights[st.peek()]) st.pop();
            if(st.empty()) right[i] = n;
            else right[i] = st.peek();
            st.push(i);
            i--;
        }
        return right;
    }
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}
