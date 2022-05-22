package com.dsa.sorting;

import java.util.Arrays;

//We will break the array into single elements, as single elements are already sorted,
//then while the recursion is on returning phase we will merge those sorted arrays(starting with single elements).
//O(n*logn)
public class MergeSort {
	//TODO: Look into this
	//In place sorting, as we are making changes to the nums array itself, but something fishy going on
	/*public static void merge(int[] nums, int start, int end, int mid) {
		int[] arr = new int[end - start];
		int i = start, j = mid, k = 0;
		while(i < mid && j < end) {
			if(nums[i] < nums[j]) {
				arr[k] = nums[i];
				i++;
			} else {
				arr[k] = nums[j];
				j++;
			} k++;
		}

		while(j < end) {
			arr[k] = nums[j];
			k++;
			j++;
		}

		while(i < mid) {
			arr[k] = nums[i];
			k++;
			i++;
		}

		for(int n=0;n< arr.length;n++) {
			nums[start+n] = arr[n];
		}
	}
	public static void mergeSort(int[] nums, int start, int end) {
		if(end - start == 1) return;

		int mid = (end + start)/2;
		mergeSort(nums, start, mid);
		mergeSort(nums, mid, end);
		merge(nums, start, end, mid);
	}*/

	//This is not In place sorting, as we are using, and returning new array, but is the preferred way
	public static int[] merge(int[] left, int[] right) {
		//Same as merging two merged array into one
		int[] arr = new int[left.length + right.length];
		int i = 0, j = 0, k = 0;
		while(i < left.length && j < right.length) {
			if(left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while(j < right.length) {
			arr[k] = right[j];
			k++; j++;
		}

		while(i < left.length) {
			arr[k] = left[i];
			k++; i++;
		}

		return arr;
	}
	public static int[] mergeSort(int[] nums) {
		if(nums.length == 1) return nums; //single element is always sorted, hence we will return the array

		int mid = nums.length/2; //finding the mid to divide it into half
		int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid)); //Arrays.copyOfRange(), will return a new
		int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length)); //sub array, in the given range
		return merge(left, right); //the two sub arrays will now be merged in sorted way
	}
	public static void main(String[] args) {
		int[] nums = {8,3,4,12,5,6};
		int[] ans = mergeSort(nums);
		System.out.println(Arrays.toString(ans));
		/*mergeSort(nums, 0, nums.length);
		System.out.println(Arrays.toString(nums));*/
	}
}