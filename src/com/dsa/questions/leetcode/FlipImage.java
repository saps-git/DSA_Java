package com.dsa.questions.leetcode;

import java.util.Arrays;

public class FlipImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr: image) {
            for(int i=0;i<(image[0].length+1)/2;i++) {
                int temp = arr[i] ^ 1;
                arr[i] = arr[image[0].length-1-i] ^ 1;
                arr[image[0].length-1-i] = temp;
            }
        }

        return image;
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString((flipAndInvertImage(image))));
    }
}
