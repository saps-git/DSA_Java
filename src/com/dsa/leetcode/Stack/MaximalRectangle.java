package com.dsa.leetcode.Stack;

//Leetcode-85

import java.util.Stack;

public class MaximalRectangle {
    public static int[] smallerLeft(int[] left, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && left[i] <= left[st.peek()]) st.pop();
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(i);
        }

        return ans;
    }

    public static int[] smallerRight(int[] right, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && right[i] <= right[st.peek()]) st.pop();
            if(st.isEmpty()) ans[i] = n;
            else ans[i] = st.peek();
            st.push(i);
        }

        return ans;
    }
    public static int maxHistogram(int[] temp) {
        int n = temp.length;
        int ans = 0;
        int[] left = smallerLeft(temp, n);
        int[] right = smallerRight(temp, n);
        for(int i=0;i<n;i++){
            int res = temp[i] * (right[i] - left[i] - 1);
            ans = Math.max(ans, res);
        }

        return ans;
    }

    public static int maximalRectangle(char[][] matrix) {
        int ans = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[] temp = new int[col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(matrix[i][j] == '1') temp[j] += 1;
                else temp[j] = 0;
            }

            int res = maxHistogram(temp);
            ans = Math.max(ans, res);
        }

        return ans;
    }

    public static void main(String[] args) {
        char[][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        System.out.println(maximalRectangle(matrix));
    }
}
