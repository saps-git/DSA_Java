package com.dsa.leetcode.BinarySearch;

public class MedianOf2SortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            int[] temp = nums1; nums1 = nums2; nums2 = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;

            int left1 = (i > 0) ? nums1[i - 1] : Integer.MIN_VALUE;
            int right1 = (i < m) ? nums1[i] : Integer.MAX_VALUE;
            int left2 = (j > 0) ? nums2[j - 1] : Integer.MIN_VALUE;
            int right2 = (j < n) ? nums2[j] : Integer.MAX_VALUE;

            if (left1 > right2) {
                iMax = i - 1;
            }
            else if (left2 > right1) {
                iMin = i + 1;
            }
            else {
                int maxLeft = Math.max(left1, left2);
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = Math.min(right1, right2);
                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
