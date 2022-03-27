package com.dsa.recursion;

public class BasicPrintNto1 {
    public static void main(String[] args) {
        int n = 5;
        printNto1(n);
        System.out.println("It's Rewind time");
        printNto1Rev(n);
        System.out.println("Now time for both");
        printBothWays(n);
    }
    public static void printNto1(int n) {
        if(n < 1) return;

        System.out.println(n);
        printNto1(n-1);
    }
    public static void printNto1Rev(int n) {
        if(n < 1) return;

        printNto1Rev(n-1);
        System.out.println(n);
    }
    public static void printBothWays(int n) {
        if(n < 1) return;

        System.out.println(n);
        printBothWays(n-1);
        System.out.println(n);
    }
}
