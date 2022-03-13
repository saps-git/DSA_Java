package com.dsa.sorting;

//Bubble - with every pass, that largest number comes to the end
//O(n^2) Stable sorting algo

public class BubbleSort {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {13,45,2,6,78,10};
        for(int i=0;i<arr.length;i++){ //passing for every element of the array
            for(int j=1;j<arr.length-i;j++){ //comparing every element with it's previous, till length-i
                // (because element in the last is sorted in the previous pass
                if(arr[j] < arr[j-1])
                    swap(arr, j, j-1);
            }
        }

        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
