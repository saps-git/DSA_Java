package com.dsa.sorting;

//Repeatedly find the min (or max) element from the unsorted array and put it in place
//O(n^2) Not Stable sorting algo

public class SelectionSort {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] =  {13,45,2,6,78,10};

        //Sorting by putting the smallest element in place on every pass
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j])
                    swap(arr, i, j);
            }
        }

        //Sorting by putting the largest element in place on every pass
       /* for(int i=arr.length-1;i>0;i--) {
            for(int j=i-1;j>=0;j--) {
                if(arr[i] < arr[j])
                    swap(arr, i, j);
            }
        }*/

        for(int i: arr)
            System.out.print(i+" ");
        System.out.println();
    }
}
