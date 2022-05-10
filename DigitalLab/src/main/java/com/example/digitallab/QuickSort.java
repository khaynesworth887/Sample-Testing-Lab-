package com.example.digitallab;

public class QuickSort {


    static int partition(int[] array, int start, int end) {
        int pivot = end;
        int i = start - 1; // take account 0 index
        for (int j= start; j<=end; j++) { // from start to end
            if (array[j] <= array[pivot]) { // if value in array is less or equal to pivot number//
                // then swap value located at index of j with value located at index of i
                i++;
                int temp = array[i]; // value located at index of i
                array[i] = array[j]; // element at index of i is replaced by element located at index of j
                array[j] = temp; // then that value is assigned at the index of j
            }
        }
        return i; // rerun new pivot number
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end); // pivot number created by the partition method
            // call quickSort recursively
            quickSort(array, start, pivot -1); // left subarray, elements before the pivot number
            quickSort(array, pivot + 1, end); // right subarray, elements after the pivot number
        }
    }


    public static void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }

}
