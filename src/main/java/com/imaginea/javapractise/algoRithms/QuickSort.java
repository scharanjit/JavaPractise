/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoRithms;

import java.util.Arrays;
import java.util.Random;
//use recursion
//choose pivot bases upon low +(high-low)/2
//divide array (use two while loops) so that left side lesser than pivot and right side mora than pivot
//if ith <= jth replace
// if low<j recursive call
//if high>i recursive call

/**
 *
 * @author Charanjit.Singh
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {9, 2, 4, 7, 3, 7, 10};
        System.out.println(Arrays.toString(array));

        int low = 0;
        int high = array.length - 1;

        quickSort(array, low, high);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

		// pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

// 
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) { //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j) {
            quickSort(arr, low, j);
        }

        if (high > i) {
            quickSort(arr, i, high);
        }
    }
}
