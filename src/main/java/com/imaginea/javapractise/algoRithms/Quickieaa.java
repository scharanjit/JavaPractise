/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoRithms;

//Big Oh O(nlog n)-->average case
//O(n2) n square in worst case
/**
 *
 * @author Charanjit.Singh
 */
public class Quickieaa {

    public static void main(String[] args) {
        int arr[] = {9, 2, 4, 1,7, 3, 7, 10,10,-2,0};
        int low = 0;
        int high = arr.length - 1;
        int arr1[]=xx(arr, low, high);
       for(int m=0;m<arr1.length;m++){
           System.out.print(" "+arr1[m]);
       }
    }

    public static int[] xx(int arr[], int low, int high) {
        if (low > high) {
            return arr;
        }
        if (arr.length == 0) {
            return null;
        }

        int i = low;
        int j = high;

        int mid = ((j - i) / 2) + i;  //choose the index of pivot elemnt
        int pivot = arr[mid];

        while (i <= j) {  //it will sort in one go

            while (arr[i] < pivot) {   //put elements in left which are less than pivot
                i++;
            }

            while (arr[j] > pivot) { //put elements in right  whioch are greater than pivot
                j--;
            }

            if (i <= j) {       //swap the element if ith and jth contion failed..
                                //thus small element go left and bigger move to right
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            if (low < j) {
                xx(arr,low,j);
            }
            if(high>i){
            xx(arr,i,high);
            }

        }

        return arr;

    }

}
