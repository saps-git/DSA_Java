package com.dsa.leetcode.BinarySearch;

//Leetcode-540

//we'll find the mid element, and check if it is same as it's next, if it is, it would mean
//that they are a pair, hence would move mid to left(-1), as the pairs should be on same side.

//Now, the number will always be on the subarray(or side) that has odd number of elements,
//hence on every iteration we'll look into the side that has odd number of elements, and finally
//when loop breaks, answer will be on start
public class SingleElement {
    public static int singleElement(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start < end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == nums[mid+1]) mid = mid-1; //so that pairs stay on the same side

            if((mid-start + 1) % 2 == 0) start = mid+1; //checking if size is even
            else end = mid;
        }
        return nums[end];
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3};
        System.out.println(singleElement(nums));
    }
}
