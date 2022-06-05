package com.dsa;

public class MaxRepeat {
    public static int maxRepeat(int[] nums) {
        int n = nums.length;
        for(int i=0;i<nums.length;i++) {
            nums[nums[i] % n] += n; //adding n to every element, and finally the element with the most val
            // will be the highest
            //nums[i] % n as it will give the original value, even if it was updated by any other element before
        }

        int max = nums[0], maxIdx = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }

        return maxIdx; //as maxIdx would contain the number with max value, indirectly implying that this index, was
        //added upon the maximum time (nums[nums[i] % n] += n).
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 5, 3, 4, 1, 7};
        System.out.println(maxRepeat(nums));
    }
}
