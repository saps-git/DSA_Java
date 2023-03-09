package com.dsa.recursion_and_backtracking;

public class Fibonacci {
	public static int fibonacciNonOpt(int n){
		if(n <= 1) return n;

		return fibonacciNonOpt(n-1) + fibonacciNonOpt(n-2); 
	}

	public static void main(String[] args) {
		System.out.println(fibonacciNonOpt(10));
	}
}