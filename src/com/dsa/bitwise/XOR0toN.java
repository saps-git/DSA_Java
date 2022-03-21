package com.dsa.bitwise;

//Answer repeats in the same cycle after every 4 numbers, write on your own and check
public class XOR0toN {
    public static int toN(int n) {
        if(n%4 == 0) return n;
        else if(n%4 == 1) return 1;
        else if(n%4 == 2) return n+1;
        else return 0;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(toN(n));
    }
}
