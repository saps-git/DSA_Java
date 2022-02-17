package com.dsa.recursion;

public class BinarySearch {
	public static int binarySearch(int[] nums, int target, int left, int right){
		if(left > right) return -1;

		//int mid = (left + right)/2;
		int mid = left + (right-left)/2; //same as above, but (left+right)/2 could gˀive exceed the int value, in case
		// of addition of very large numbers, hence this formula
		if(target == nums[mid]) return mid;
		if(target < nums[mid]) return binarySearch(nums, target, left, mid-1);
		return binarySearch(nums, target, mid+1, right);
	}
	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 12;
		int left = 0, right = nums.length-1;
        System.out.println(binarySearch(nums, target, left, right)); 
	}
}