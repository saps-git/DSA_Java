package com.dsa.bitwiseANDmaths;

public class DecimalToBinary {
    public static int decimalToBinary(int n) {
        int digits = (int)(Math.log(n)/Math.log(2)) + 1; //counting number of digits in the binary form of n
        String ans = "";
        for(int i=digits-1; i>=0; i--){
            int mask = n >> i; //creating a mask
            if((mask&1) != 0) ans += '1'; //as doing & will give you the same number
            else ans += '0';
        }
        return Integer.parseInt(ans);
    }
    public static void main(String[] args) {
        int n = 18;
        System.out.println(decimalToBinary(n));
        System.out.println(Integer.toBinaryString(18));
    }
}
