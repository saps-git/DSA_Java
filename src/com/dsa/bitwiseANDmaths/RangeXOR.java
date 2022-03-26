package com.dsa.bitwiseANDmaths;

public class RangeXOR {
    public static int xor(int n) {
        if(n%4 == 0) return n;
        else if(n%4 == 1) return 1;
        else if(n%4 == 2) return n+1;
        else return 0;
    }
    public static int rangeXOR(int a, int b) {
        return xor(b)^xor(a-1); //XOR'ing the a-1 from b will negate it, as it will become 0
    }
    public static void main(String[] args) {
        int a = 4, b = 8;
        System.out.println(rangeXOR(a, b));
    }
}
