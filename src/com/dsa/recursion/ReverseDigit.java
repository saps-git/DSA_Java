package com.dsa.recursion;

public class ReverseDigit {
    public static void main(String[] args) {
        int n = 123;
        /*reverseDigit(n);
        System.out.println(sum);*/

        int digits = (int)Math.log10(n) + 1;
        System.out.println(reverseDigit2(n, digits));
    }
    //Taking a static var
    /*static int sum = 0; //this will be the final answer
    public static void reverseDigit(int n) {
        if(n == 0) return;

        int rem = n%10;
        sum = sum*10 + rem;
        reverseDigit(n/10);
    }*/
    //Taking extra argument
    //f(n) = rem * 10^place of the number + f(n/10)
    public static int reverseDigit2(int n, int digits) {
        if(n%10 == n) return n; //single digit, which is base case

        int rem = n%10;
        return rem*(int)Math.pow(10, digits-1) + reverseDigit2(n/10, digits-1);
    }
}
