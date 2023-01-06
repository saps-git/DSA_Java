package com.dsa.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegInSubarray {
    public static int[] firstNegativeInteger(int[] nums, int k) {
        int i=0, j=0;
        Queue<Integer> queue = new LinkedList<>();
        int[] ans = new int[nums.length - k + 1];
        int idx = 0;
        while(j < nums.length) {
            if(nums[j] < 0) queue.add(nums[j]);
            if((j-i) + 1 == k) {
                if(!queue.isEmpty()) {
                    ans[idx++] = queue.peek();
                    if(nums[i] == queue.peek()) queue.remove();
                } else {
                    ans[idx++] = 0;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(Arrays.toString(firstNegativeInteger(nums, k)));
    }
}
