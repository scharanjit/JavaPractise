/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolta.One;

/**
 *
 * @author charanjit.singh
 */
public class generateHashFunction {

    public static void main(String[] args) {
        System.out.println("1: " + sumOfChars("HASH"));
        System.out.println("2: " + sumOfChars("SAHH"));

        System.out.println("3: " + sumOfShiftedChars("HASH"));
        System.out.println("4: " + sumOfShiftedChars("SAHH"));
        //Flaw of 3 & 4: it didn't take element position into account.
        
         System.out.println("5: " + elfHash("HASH"));
          System.out.println("6: " + elfHash("SAHH"));
    }

    public static int sumOfChars(String toHash) {
        int hashValue = 0;
        for (int Pos = 0; Pos < toHash.length(); Pos++) {
            hashValue = hashValue + toHash.charAt(Pos);
        }
        return hashValue;
    }

    public static int sumOfShiftedChars(String toHash) {
        int hashValue = 0;
        for (int Pos = 0; Pos < toHash.length(); Pos++) {
            hashValue = (hashValue << 4) + toHash.charAt(Pos);
        }
        return hashValue;
    }

    public static int elfHash(String toHash) {
        int hashValue = 0;
        for (int Pos = 0; Pos < toHash.length(); Pos++) { // use all elements
            hashValue = (hashValue << 4) + toHash.charAt(Pos); // shift/mix
            System.out.println(hashValue);
            int hiBits = hashValue & 0xF0000000; // get high nybble
            System.out.println(hiBits);
                 
            if (hiBits != 0) {
                hashValue ^= hiBits >> 24;  // xor high nybble with second nybble
                System.out.println("hasValsue 2 : "+hashValue);
            }
            hashValue &= ~hiBits; // clear high nybble
             System.out.println(hashValue);
        }
        return hashValue;
    }

}
