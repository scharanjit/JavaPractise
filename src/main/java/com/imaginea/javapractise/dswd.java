/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charanjit.Singh
 */
public class dswd {

    public static void main(String[] args) {
        fnc(1, 2, 4);
    }
   

    private static void fnc(int i, int j, int n) {
          int k = 1;
        k=i+j;
        i = j;
        j = k;
        System.out.println(" outside "+k);
        while (k < n) {
            System.out.println("inside "+k);
            fnc(i, j, k);
        }

    }

}
