package com.dsa.questions.leetcode;

//Leetcode-204 (Also known as sieve of eratosthenes)

import java.util.Arrays;

public class CountPrime {
    public static int countPrimes(int n) {
        if(n <= 2) return 0;
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(arr[i]) {
                for(int j=i*2;j<n;j+=i) arr[j] = false;
            }
        }

        int ans = 0;
        for(int i=2;i<n;i++) {
            if(arr[i]) ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println(countPrimes(n));
    }
}

