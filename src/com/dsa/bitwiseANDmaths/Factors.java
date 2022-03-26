package com.dsa.bitwiseANDmaths;

public class Factors {
    //brute force O(n)
    /*public static void factors(int n) {
        for(int i=1;i<=n;i++) {
            if(n%i == 0) System.out.println(i);
        }
    }*/

    //O(n/2)
    /*public static void factors(int n) {
        System.out.println(1+" "+n);
        int start = 2, end = n-1;
        while(start < end || start <= n/2 || end <= n/2) {
            int ans = start*end;
            if(ans == n) {
                System.out.println(start+" "+end);
                start++;
                end--;
            }
            else if(ans > n) end--;
            else start++;
        }
    }*/

    //O(sqrt(n))
    public static void factors(int n) {
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i == 0) System.out.print(i+" "+n/i+" ");
        }
    }
    public static void main(String[] args) {
        int n = 20;
        factors(n);
    }
}
