package com.dsa.leetcode;

//Leetcode-69

public class Sqrt {
    public static int mySqrt(int x) {
        if(x<2) return x;
        int start = 0, end = x/2;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid == x/mid) return mid; // mid==x/mid is same as x*x==mid, done to prevent overflow
            else if(mid < x/mid) start = mid+1;
            else end = mid-1;
        }
        return end;
    }
    public static void main(String[] args) {
        int x = 40;
        System.out.println(mySqrt(x));
    }
}
