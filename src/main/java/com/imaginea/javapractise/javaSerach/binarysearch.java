/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSerach;

/**
 *
 * @author Charanjit.Singh
 */
public class binarysearch {

    public static void main(String[] args) {

        int a[] = {0,0,0,1,2,3,4,5,6,7};

        int ele = 7;

        System.out.println("Index of "+ele+" is "+binary(a, ele));

    }

    public static int binary(int a[], int k) {
        int l = 0;
        int u = a.length - 1;
        int m;
        
       
        while (l <= u) {
            m = l + (u - 1) / 2;
            if (a[m] < k) {
                l = m + 1;
            } else if (a[m] == k) {
                
                return m;
             
            } else {
                u = m - 1;

            }

        }
        return -1;
    }
}
