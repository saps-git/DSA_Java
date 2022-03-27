package com.dsa.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sumOfDigits(n));
    }
    public static int sumOfDigits(int n) {
        if(n <= 0) return 0;

        return n%10 + sumOfDigits(n/10);
    }
}
