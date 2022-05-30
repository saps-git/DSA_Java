package com.dsa.leetcode.Linkedlist;

//Leetcode-287

//Converted the problem to finding the head of link list cycyle, as needed to be done O(n) time and O(1) space
//and all other methods violate the above mentioned constraints in some sort or the other

public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
}
