package com.dsa.questions.leetcode.BinarySearch;

//Leetcode-704

public class BinarySearch {
	public static int binarySearch(int[] nums, int target){
		int left = 0;
		int right = nums.length - 1;

		while(left <= right){
			int mid = (left + right)/2;
			if(target == nums[mid]) return mid;
			if(target < nums[mid]) right = mid-1;
			else left = mid+1;
		}

		return -1;
	}
	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 12;
		System.out.println(binarySearch(nums, target));
	}
}