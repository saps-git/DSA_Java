package com.dsa.recursion_and_backtracking;

public class Factorial {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(factorial(n));
    }
    public static int factorial(int n) {
        if(n == 1) return 1;

        return n*factorial(n-1);
    }
}
