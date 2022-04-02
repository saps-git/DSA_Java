package com.dsa.recursion_and_backtracking;

public class Palindrome {
	public static boolean isPalindrome(String str){
		if(str.length() == 0 || str.length() == 1) //if only middle char is left, or none
			return true;

		if(str.charAt(0) == str.charAt(str.length()-1)) //if chars on both ends are same
			return isPalindrome(str.substring(1, str.length()-1)); //removing chars from both ends, and calling the function again (recursively).

		return false;
	}

	public static void main(String[] args) {
		String str = "malayalam";
		System.out.println(isPalindrome(str));
	}
}