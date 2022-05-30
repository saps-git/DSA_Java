package com.dsa.leetcode.Arrays;

//Leetcode-88

//Merging without using extra space
public class MergeSortedArray {
    //Will take two pointers(p1 & p2) that mark the end of 2 arrays and i ,that would be the index
    // at which we are going to write the value , now we will compare the values at p1 and p2 and write the value
    // that is larger at index i , after writing we decrement the respective indexes .
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, i=(m+n)-1;
        while(p1 >=0 && p2 >= 0) {
            if(nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
                p1--;
            } else {
                nums1[i] = nums2[p2];
                p2--;
            }
            i--; //we decrement i as atleast one of them has populated nums1[i];
        }

        //Edge case might occur, when there are elements left in nums2, but p1 is >0, then we just add all the elements
        //of nums2 to nums1
        while(p2 >= 0) nums1[i--] = nums2[p2--]; //i-- & p2-- means referencing the values, and then decr them for next
        //loop cycle

        for(int num: nums1)
            System.out.print(num+" ");
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
