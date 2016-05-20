/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoRithms;

//divide the array into two EQUAL parts till i<j using middle = low +(h-l)/2 recursively
//copy all elements into temporary array
//comapre two elements from temp array ith and midle+1th...which ever is less copy it to main array
//
/**
 *
 * @author Charanjit.Singh
 */
public class MergeSort {
     
    private int[] array;
    private int[] tempMergArr;
    private int length;
   static  int[] inputArr = {45,23,11,89,77,98,4,28,65,43,54,41};
 
    public static void main(String a[]){
         
       
        MergeSort mms = new MergeSort();
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
    public void print(){
    for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
           // print();
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            //print();
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
            print();
        }
    }
 
    
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
            //copy the array in temp array
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        //take two elements from each set
        //which ever is less..copy that into new array
         // Copy the smallest values from either the left or the right side back
    // to the original array
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }  
           // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}
