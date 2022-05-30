package com.dsa.leetcode;

//Leetcode-137

public class SingleNumber2 {
    //will not work for -ve numbers
    //First we sort the array, then check the adjacent element, if ok, then skip to i=+3(next element)
    //O(nlogn)
    /*public static int singleNumber(int[] nums) {
        int n = nums.length;
        if(n<3) return nums[0];
        Arrays.sort(nums); //sorting the array
        if(nums[0] != nums[1]) return nums[0]; //checking corner case: if first not equal to second
        else if(nums[n-1] != nums[n-2]) return nums[n-1]; //or, last not equal to second last
        int i=1;
        while(i<n) {
            if(nums[i] != nums[i-1]) return nums[i-1];
            else i=+3; //skipping to the middle of next three occurences
        }
        return -1;
    }*/

    //Below two solns will work for not only for 3, but for 4,5,6... any number

    //Converting every number to binary, and adding up their set bits. The index which is not a multiple of three,
    //is the set bit of the answer.
    //O(32n)
    //But, was not working for some scenarios on Leetcode
    public static int singleNumber(int[] nums) {
        int[] ans = new int[32]; //array of 32 for representing 32 bits
        int sol = 0;
        for(int i=0;i<nums.length;i++) {
            String str = Integer.toBinaryString(nums[i]); //find the binary of every number
            for(int j=0;j<str.length();j++) {
                if(str.charAt(j) == '1') ans[j]++; //incr the pos of set bits
            }
        }
        for(int x=0;x<ans.length;x++) {
            if(ans[x]%3 != 0) {  //if not multiple of 3
                sol = sol + (int)Math.pow(2, x); //add indexes to the soln
            }
        }
        return sol;
    }

    //Works on Leetcode
    //Create a mask for every bit and do & with that bit for every number. If it is set, incr the sum.
    //After every loop for every bit, check if is it the multiple of 3, if not do the operation, repeat for every bit
    //O(32n)
    /*public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            int mask = 1 << i;
            for (int n : nums)
                if ((n & mask) != 0)
                    sum++;
            if (sum % 3 == 1)
                res = res | mask;
        }
        return res;
    }*/
    public static void main(String[] args) {
        int[] nums = {-1,2,-1,2,3,-1,2};
        System.out.println(singleNumber(nums));
    }
}
