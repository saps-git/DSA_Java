package com.dsa.leetcode;

//Leetcode-1492

import java.util.Arrays;

public class KthFactorOfN {
    //O(n)
    /*public static int kthFactor(int n, int k) {
        int kCounter = 0;
        for(int i=1;i<=n;i++) {
            if(n%i == 0) {
                if(++kCounter == k) return i;
            }
        }
        return -1;
    }*/

    //O(sqrt(n))
    //We will run till sqrt(n) first to check in the first half of possible outcomes
    //then will run again from sqrt(n) to 1(i--), and check if it is there, as it will be (n/i)
    public static int kthFactor(int n, int k) {
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i == 0 && --k == 0) return i; //--k == 0 , is decrementing the counter(k) till it's 0,
        }                                      //which is same as (++kCounter == k)
        for(int i=(int)Math.sqrt(n);i>=1;i--) {
            if(n%i == 0 && --k == 0) return n/i;
        }

        return -1;
    }
    public static void main(String[] args) {
        int n = 12, k = 3;
        System.out.println(kthFactor(n, k));
    }

    public static class CountPrime {
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
}
