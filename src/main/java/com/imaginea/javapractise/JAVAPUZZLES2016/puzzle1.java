/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imaginea.javapractise.JAVAPUZZLES2016;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author charanjits
 */
public class puzzle1{
    public static void main(String[] args) {
        Set s =  new HashSet();
        for(short i=0;i<100;i++){
        s.add(i);
        s.remove(i-1); //int values expression
        }
         System.out.println(s.size());
        for(int i=0;i<100;i++){
        s.add(i);
        s.remove(i-1);
        }
        System.out.println(s.size());
                
    }
     
    
}
