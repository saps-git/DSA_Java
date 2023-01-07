package com.dsa.slidingwindow;

public class SubarraySumK {
    public static int subarraySum(int[] nums, int k) {
        int i=0, j=0;
        int sum = 0, count = 0;
        while(j < nums.length) {
            sum += nums[j];
            if(sum == k) {
                count += 1;
            }
            if(sum > k) {
                while(sum > k) {
                    sum -= nums[i];
                    i++;
                }
                if(sum == k) count += 1;
            }
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {9, 4, 20, 3, 10, 5};
        int k = 33;
        System.out.println(subarraySum(nums, k));
    }
}
