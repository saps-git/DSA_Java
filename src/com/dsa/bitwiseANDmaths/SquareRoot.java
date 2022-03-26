package com.dsa.bitwiseANDmaths;

//Binary search, as it will have the sqrt in b/w 0 to n/2, we can just find mid, and square it, to check if it is ==n, else
//we can reduce the search space as required.

public class SquareRoot {
    public static int squareRoot(int n) {
        int left = 0, right=n/2; // n/2 because eg. 36's sqrt will always be less than 18, least is 4 & 2
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(mid*mid == n) return mid;
            else if(mid*mid < n) left = mid+1;
            else right = mid-1;
        }
        return right;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(squareRoot(n));
    }
}
