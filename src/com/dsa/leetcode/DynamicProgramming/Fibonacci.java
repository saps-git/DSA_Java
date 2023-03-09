package com.dsa.leetcode.DynamicProgramming;

//Leetcode-509

public class Fibonacci {
	private static int fibonacci(int n){
		if(n < 2) return n;

		int first = 0, second = 1;
		int curr = 0;
		for(int i=2;i<=n;i++) {
			curr = first + second;
			first = second;
			second = curr;
		}

		return curr;
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}
}