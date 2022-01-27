package com.dsa.recursion;

public class SumofN {
	public static int sumOfNnoob(int num, int ans){
	//How noobs write code
		if(num == 0)
			return ans;

		ans = num + ans;
		return sumOfNnoob(num-1, ans);
	}

	public static int sumOfNpro(int num){
	//How pros write code
		if(num == 1)
			return num;

		return num + sumOfNpro(num-1);
	}

	public static void main(String[] args) {
		System.out.println(sumOfNnoob(10, 0));
		System.out.println(sumOfNpro(10));
	}
}