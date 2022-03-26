package com.dsa.bitwiseANDmaths;

public class FindithBit {
    public static int ithBit(int num, int i) {
        int mask = 1<<i-1; //creating a mask, with i-1 zeros so 1 is pushed to the left to the pos i,
        int ans = num&mask; // as we need to & it with num, as & returns the number only, hence if it is 0 or 1 it will return that only
        return ans>>i-1; //to return the answer if it is 1 or 0, by removing all other bits(as they are 0).
    }
    public static void main(String[] args) {
        int num = 16, i = 3;
        System.out.println(Integer.toBinaryString(num)); //to check the binary of num
        System.out.println(ithBit(num, i));
    }
}
