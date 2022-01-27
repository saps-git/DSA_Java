package com.dsa.recursion;

public class DecimaltoBinary {
	public static String toBinarynoob(int num, String result){
		//How noobs write code
		if(num == 0) return result;

		result = num%2 + result;
		return toBinarynoob(num/2, result);
	}

	public static String toBinarypro(int num){
		//How pros write code
		if(num == 1) return "1";

		return num%2 + toBinarypro(num/2);
	}

	public static void main(String[] args) {
		int num = 9;
		System.out.println(toBinarynoob(num, ""));
		System.out.println(toBinarypro(num));
	}
}

/*
Formula-

9%2 = 1
4%2 = 0
2%2 = 0
1%2 = 1

hence ans = 1001
*/