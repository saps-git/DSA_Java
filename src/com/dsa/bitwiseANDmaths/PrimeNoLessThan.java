package com.dsa.bitwiseANDmaths;

import java.util.Arrays;

public class PrimeNoLessThan {
    //Brute Force
    /*
    public static boolean isPrime(int n) {
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void primeLessThan(int n) {
        int i = 2;
        while(i < n) {
            if(isPrime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }*/

    //Efficient Method (sieve of eratosthenes)
    public static void primeLessThan(int n) {
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(arr[i]) {
                for(int j=i*2;j<=n;j+=i) {
                    arr[j] = false;
                }
            }
        }

        for(int i=2;i<=n;i++) {
            if(arr[i] == true) System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int n = 40;
        primeLessThan(n);
    }
}
