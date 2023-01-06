package com.dsa.slidingwindow;

public class MaxSumSubarrayK {
    public static int maxSum(int[] nums, int k) {
        int i=0, j=0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(j < nums.length) {
            sum += nums[j];
            if((j - i) + 1 == k) { //(j - i) + 1 == k) to check the window
                max = Math.max(max, sum);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        System.out.println(maxSum(nums, k));
    }
}
