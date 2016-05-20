/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoRithms;
//Outer loop: Iterate from left to right
//Inner Loop : Iterate from right to left using while loop & swap based upon key value
/**
 *
 * @author charanjit.singh
 */
public class insertionSort {

    public static void main(String[] args) {
        int arr[] = {3, 4, 0, 8, 9, 7, 5,1,2};
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i >= 0) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
            printNumbers(arr);
        }
    }

    private static void printNumbers(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

}
