package com.dsa.bitwise;

public class OddEven {
    public static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
    public static void main(String[] args) {
        int num = 14;
        System.out.println(isOdd(num));
    }
}
